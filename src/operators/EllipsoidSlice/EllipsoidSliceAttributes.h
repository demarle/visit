// Copyright (c) Lawrence Livermore National Security, LLC and other VisIt
// Project developers.  See the top-level LICENSE file for dates and other
// details.  No copyright assignment is required to contribute to VisIt.

#ifndef ELLIPSOIDSLICEATTRIBUTES_H
#define ELLIPSOIDSLICEATTRIBUTES_H
#include <AttributeSubject.h>


// ****************************************************************************
// Class: EllipsoidSliceAttributes
//
// Purpose:
//    EllipsoidSliceAttributes
//
// Notes:      Autogenerated by xml2atts.
//
// Programmer: xml2atts
// Creation:   omitted
//
// Modifications:
//   
// ****************************************************************************

class EllipsoidSliceAttributes : public AttributeSubject
{
public:
    // These constructors are for objects of this class
    EllipsoidSliceAttributes();
    EllipsoidSliceAttributes(const EllipsoidSliceAttributes &obj);
protected:
    // These constructors are for objects derived from this class
    EllipsoidSliceAttributes(private_tmfs_t tmfs);
    EllipsoidSliceAttributes(const EllipsoidSliceAttributes &obj, private_tmfs_t tmfs);
public:
    virtual ~EllipsoidSliceAttributes();

    virtual EllipsoidSliceAttributes& operator = (const EllipsoidSliceAttributes &obj);
    virtual bool operator == (const EllipsoidSliceAttributes &obj) const;
    virtual bool operator != (const EllipsoidSliceAttributes &obj) const;
private:
    void Init();
    void Copy(const EllipsoidSliceAttributes &obj);
public:

    virtual const std::string TypeName() const;
    virtual bool CopyAttributes(const AttributeGroup *);
    virtual AttributeSubject *CreateCompatible(const std::string &) const;
    virtual AttributeSubject *NewInstance(bool) const;

    // Property selection methods
    virtual void SelectAll();
    void SelectOrigin();
    void SelectRadii();
    void SelectRotationAngle();

    // Property setting methods
    void SetOrigin(const double *origin_);
    void SetRadii(const double *radii_);
    void SetRotationAngle(const double *rotationAngle_);

    // Property getting methods
    const double *GetOrigin() const;
          double *GetOrigin();
    const double *GetRadii() const;
          double *GetRadii();
    const double *GetRotationAngle() const;
          double *GetRotationAngle();

    // Persistence methods
    virtual bool CreateNode(DataNode *node, bool completeSave, bool forceAdd);
    virtual void SetFromNode(DataNode *node);


    // Keyframing methods
    virtual std::string               GetFieldName(int index) const;
    virtual AttributeGroup::FieldType GetFieldType(int index) const;
    virtual std::string               GetFieldTypeName(int index) const;
    virtual bool                      FieldsEqual(int index, const AttributeGroup *rhs) const;


    // IDs that can be used to identify fields in case statements
    enum {
        ID_origin = 0,
        ID_radii,
        ID_rotationAngle,
        ID__LAST
    };

private:
    double origin[3];
    double radii[3];
    double rotationAngle[3];

    // Static class format string for type map.
    static const char *TypeMapFormatString;
    static const private_tmfs_t TmfsStruct;
};
#define ELLIPSOIDSLICEATTRIBUTES_TMFS "DDD"

#endif
