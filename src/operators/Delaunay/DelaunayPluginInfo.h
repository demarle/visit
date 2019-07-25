// Copyright (c) Lawrence Livermore National Security, LLC and other VisIt
// Project developers.  See the top-level LICENSE file for dates and other
// details.  No copyright assignment is required to contribute to VisIt.

// ************************************************************************* //
//  File: DelaunayPluginInfo.h
// ************************************************************************* //

#ifndef DELAUNAY_PLUGIN_INFO_H
#define DELAUNAY_PLUGIN_INFO_H
#include <OperatorPluginInfo.h>
#include <operator_plugin_exports.h>

class DelaunayAttributes;

// ****************************************************************************
//  Class: DelaunayPluginInfo
//
//  Purpose:
//    Five classes that provide all the information about an Delaunay operator
//
//  Programmer: generated by xml2info
//  Creation:   omitted
//
//  Modifications:
//
// ****************************************************************************

class DelaunayGeneralPluginInfo : public virtual GeneralOperatorPluginInfo
{
  public:
    virtual const char *GetName() const;
    virtual const char *GetVersion() const;
    virtual const char *GetID() const;
    virtual bool  EnabledByDefault() const;
    virtual const char *GetCategoryName() const;
};

class DelaunayCommonPluginInfo : public virtual CommonOperatorPluginInfo, public virtual DelaunayGeneralPluginInfo
{
  public:
    virtual AttributeSubject *AllocAttributes();
    virtual void CopyAttributes(AttributeSubject *to, AttributeSubject *from);
};

class DelaunayGUIPluginInfo : public virtual GUIOperatorPluginInfo, public virtual DelaunayCommonPluginInfo
{
  public:
    virtual QString *GetMenuName() const;
    virtual QvisPostableWindowObserver *CreatePluginWindow(int type,
        AttributeSubject *attr, const QString &caption, const QString &shortName,
        QvisNotepadArea *notepad);
};

class DelaunayViewerEnginePluginInfo : public virtual ViewerEngineOperatorPluginInfo, public virtual DelaunayCommonPluginInfo
{
  public:
    virtual AttributeSubject *GetClientAtts();
    virtual AttributeSubject *GetDefaultAtts();
    virtual void SetClientAtts(AttributeSubject *atts);
    virtual void GetClientAtts(AttributeSubject *atts);

    virtual void InitializeOperatorAtts(AttributeSubject *atts,
                                        const avtPlotMetaData &plot,
                                        const bool fromDefault);
    virtual void UpdateOperatorAtts(AttributeSubject *atts,
                                    const avtPlotMetaData &plot);
    virtual const char *GetMenuName() const;

    static void InitializeGlobalObjects();
  private:
    static DelaunayAttributes *defaultAtts;
    static DelaunayAttributes *clientAtts;
};

class DelaunayViewerPluginInfo : public virtual ViewerOperatorPluginInfo, public virtual DelaunayViewerEnginePluginInfo
{
  public:
};

class DelaunayEnginePluginInfo : public virtual EngineOperatorPluginInfo, public virtual DelaunayViewerEnginePluginInfo
{
  public:
    virtual avtPluginFilter *AllocAvtPluginFilter();
};

class DelaunayScriptingPluginInfo : public virtual ScriptingOperatorPluginInfo, public virtual DelaunayCommonPluginInfo
{
  public:
    virtual void InitializePlugin(AttributeSubject *subj, void *data);
    virtual void *GetMethodTable(int *nMethods);
    virtual bool TypesMatch(void *pyobject);
    virtual char *GetLogString();
    virtual void SetDefaults(const AttributeSubject *atts);
};

#endif
