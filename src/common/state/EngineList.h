// Copyright (c) Lawrence Livermore National Security, LLC and other VisIt
// Project developers.  See the top-level LICENSE file for dates and other
// details.  No copyright assignment is required to contribute to VisIt.

#ifndef ENGINELIST_H
#define ENGINELIST_H
#include <state_exports.h>
#include <string>
#include <AttributeSubject.h>

class EngineProperties;

// ****************************************************************************
// Class: EngineList
//
// Purpose:
//    This class contains a list of host names on which engines are running.
//
// Notes:      Autogenerated by xml2atts.
//
// Programmer: xml2atts
// Creation:   omitted
//
// Modifications:
//   
// ****************************************************************************

class STATE_API EngineList : public AttributeSubject
{
public:
    // These constructors are for objects of this class
    EngineList();
    EngineList(const EngineList &obj);
protected:
    // These constructors are for objects derived from this class
    EngineList(private_tmfs_t tmfs);
    EngineList(const EngineList &obj, private_tmfs_t tmfs);
public:
    virtual ~EngineList();

    virtual EngineList& operator = (const EngineList &obj);
    virtual bool operator == (const EngineList &obj) const;
    virtual bool operator != (const EngineList &obj) const;
private:
    void Init();
    void Copy(const EngineList &obj);
public:

    virtual const std::string TypeName() const;
    virtual bool CopyAttributes(const AttributeGroup *);
    virtual AttributeSubject *CreateCompatible(const std::string &) const;
    virtual AttributeSubject *NewInstance(bool) const;

    // Property selection methods
    virtual void SelectAll();
    void SelectEngineName();
    void SelectSimulationName();
    void SelectProperties();

    // Property setting methods
    void SetEngineName(const stringVector &engineName_);
    void SetSimulationName(const stringVector &simulationName_);

    // Property getting methods
    const stringVector &GetEngineName() const;
          stringVector &GetEngineName();
    const stringVector &GetSimulationName() const;
          stringVector &GetSimulationName();
    const AttributeGroupVector &GetProperties() const;
          AttributeGroupVector &GetProperties();

    // Persistence methods
    virtual bool CreateNode(DataNode *node, bool completeSave, bool forceAdd);
    virtual void SetFromNode(DataNode *node);


    // Attributegroup convenience methods
    void AddProperties(const EngineProperties &);
    void ClearProperties();
    void RemoveProperties(int i);
    int  GetNumProperties() const;
    EngineProperties &GetProperties(int i);
    const EngineProperties &GetProperties(int i) const;

    EngineProperties &operator [] (int i);
    const EngineProperties &operator [] (int i) const;


    // Keyframing methods
    virtual std::string               GetFieldName(int index) const;
    virtual AttributeGroup::FieldType GetFieldType(int index) const;
    virtual std::string               GetFieldTypeName(int index) const;
    virtual bool                      FieldsEqual(int index, const AttributeGroup *rhs) const;


    // IDs that can be used to identify fields in case statements
    enum {
        ID_engineName = 0,
        ID_simulationName,
        ID_properties,
        ID__LAST
    };

protected:
    AttributeGroup *CreateSubAttributeGroup(int index);
private:
    stringVector         engineName;
    stringVector         simulationName;
    AttributeGroupVector properties;

    // Static class format string for type map.
    static const char *TypeMapFormatString;
    static const private_tmfs_t TmfsStruct;
};
#define ENGINELIST_TMFS "s*s*a*"

#endif
