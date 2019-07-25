// Copyright (c) Lawrence Livermore National Security, LLC and other VisIt
// Project developers.  See the top-level LICENSE file for dates and other
// details.  No copyright assignment is required to contribute to VisIt.

#ifndef PICKVARINFO_H
#define PICKVARINFO_H
#include <state_exports.h>
#include <string>
#include <AttributeSubject.h>

#include "snprintf.h"

// ****************************************************************************
// Class: PickVarInfo
//
// Purpose:
//    This class contains PickVarInfo.
//
// Notes:      Autogenerated by xml2atts.
//
// Programmer: xml2atts
// Creation:   omitted
//
// Modifications:
//   
// ****************************************************************************

class STATE_API PickVarInfo : public AttributeSubject
{
public:
    enum Centering
    {
        Nodal,
        Zonal,
        None
    };

    // These constructors are for objects of this class
    PickVarInfo();
    PickVarInfo(const PickVarInfo &obj);
protected:
    // These constructors are for objects derived from this class
    PickVarInfo(private_tmfs_t tmfs);
    PickVarInfo(const PickVarInfo &obj, private_tmfs_t tmfs);
public:
    virtual ~PickVarInfo();

    virtual PickVarInfo& operator = (const PickVarInfo &obj);
    virtual bool operator == (const PickVarInfo &obj) const;
    virtual bool operator != (const PickVarInfo &obj) const;
private:
    void Init();
    void Copy(const PickVarInfo &obj);
public:

    virtual const std::string TypeName() const;
    virtual bool CopyAttributes(const AttributeGroup *);
    virtual AttributeSubject *CreateCompatible(const std::string &) const;
    virtual AttributeSubject *NewInstance(bool) const;

    // Property selection methods
    virtual void SelectAll();
    void SelectVariableName();
    void SelectVariableType();
    void SelectNames();
    void SelectValues();
    void SelectMixNames();
    void SelectMixValues();
    void SelectMiscMessage();
    void SelectNumMatsPerZone();
    void SelectMatNames();
    void SelectNumSpecsPerMat();
    void SelectFloatFormat();

    // Property setting methods
    void SetVariableName(const std::string &variableName_);
    void SetVariableType(const std::string &variableType_);
    void SetNames(const stringVector &names_);
    void SetValues(const doubleVector &values_);
    void SetMixNames(const stringVector &mixNames_);
    void SetMixValues(const doubleVector &mixValues_);
    void SetMixVar(bool mixVar_);
    void SetCentering(Centering centering_);
    void SetMiscMessage(const std::string &miscMessage_);
    void SetNumMatsPerZone(const intVector &numMatsPerZone_);
    void SetMatNames(const stringVector &matNames_);
    void SetNumSpecsPerMat(const intVector &numSpecsPerMat_);
    void SetTreatAsASCII(bool treatAsASCII_);
    void SetFloatFormat(const std::string &floatFormat_);

    // Property getting methods
    const std::string  &GetVariableName() const;
          std::string  &GetVariableName();
    const std::string  &GetVariableType() const;
          std::string  &GetVariableType();
    const stringVector &GetNames() const;
          stringVector &GetNames();
    const doubleVector &GetValues() const;
          doubleVector &GetValues();
    const stringVector &GetMixNames() const;
          stringVector &GetMixNames();
    const doubleVector &GetMixValues() const;
          doubleVector &GetMixValues();
    bool               GetMixVar() const;
    Centering          GetCentering() const;
    const std::string  &GetMiscMessage() const;
          std::string  &GetMiscMessage();
    const intVector    &GetNumMatsPerZone() const;
          intVector    &GetNumMatsPerZone();
    const stringVector &GetMatNames() const;
          stringVector &GetMatNames();
    const intVector    &GetNumSpecsPerMat() const;
          intVector    &GetNumSpecsPerMat();
    bool               GetTreatAsASCII() const;
    const std::string  &GetFloatFormat() const;
          std::string  &GetFloatFormat();

    // Enum conversion functions
    static std::string Centering_ToString(Centering);
    static bool Centering_FromString(const std::string &, Centering &);
protected:
    static std::string Centering_ToString(int);
public:

    // Keyframing methods
    virtual std::string               GetFieldName(int index) const;
    virtual AttributeGroup::FieldType GetFieldType(int index) const;
    virtual std::string               GetFieldTypeName(int index) const;
    virtual bool                      FieldsEqual(int index, const AttributeGroup *rhs) const;

    // User-defined methods
    void PrintSelf(ostream &os);
    void CreateOutputString(std::string &, const std::string &);
    void PrintTensor(std::string &, const std::vector<double> &, int, int, int);
    void PrintSymmetricTensor(std::string &, const std::vector<double> &, int, int, int);
    bool HasInfo(void);
    void PrintArray(std::string &, const std::vector<double> &, int, int, int);
    void CreateOutputMapNode(const std::string &, MapNode &);

    // IDs that can be used to identify fields in case statements
    enum {
        ID_variableName = 0,
        ID_variableType,
        ID_names,
        ID_values,
        ID_mixNames,
        ID_mixValues,
        ID_mixVar,
        ID_centering,
        ID_miscMessage,
        ID_numMatsPerZone,
        ID_matNames,
        ID_numSpecsPerMat,
        ID_treatAsASCII,
        ID_floatFormat,
        ID__LAST
    };

private:
    std::string  variableName;
    std::string  variableType;
    stringVector names;
    doubleVector values;
    stringVector mixNames;
    doubleVector mixValues;
    bool         mixVar;
    int          centering;
    std::string  miscMessage;
    intVector    numMatsPerZone;
    stringVector matNames;
    intVector    numSpecsPerMat;
    bool         treatAsASCII;
    std::string  floatFormat;

    // Static class format string for type map.
    static const char *TypeMapFormatString;
    static const private_tmfs_t TmfsStruct;
};
#define PICKVARINFO_TMFS "sss*d*s*d*bisi*s*i*bs"

#endif
