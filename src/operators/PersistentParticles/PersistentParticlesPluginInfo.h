// Copyright (c) Lawrence Livermore National Security, LLC and other VisIt
// Project developers.  See the top-level LICENSE file for dates and other
// details.  No copyright assignment is required to contribute to VisIt.

// ************************************************************************* //
//  File: PersistentParticlesPluginInfo.h
// ************************************************************************* //

#ifndef PERSISTENTPARTICLES_PLUGIN_INFO_H
#define PERSISTENTPARTICLES_PLUGIN_INFO_H
#include <OperatorPluginInfo.h>
#include <operator_plugin_exports.h>

class PersistentParticlesAttributes;

// ****************************************************************************
//  Class: PersistentParticlesPluginInfo
//
//  Purpose:
//    Five classes that provide all the information about an PersistentParticles operator
//
//  Programmer: generated by xml2info
//  Creation:   omitted
//
//  Modifications:
//
// ****************************************************************************

class PersistentParticlesGeneralPluginInfo : public virtual GeneralOperatorPluginInfo
{
  public:
    virtual const char *GetName() const;
    virtual const char *GetVersion() const;
    virtual const char *GetID() const;
    virtual bool  EnabledByDefault() const;
    virtual const char *GetCategoryName() const;
};

class PersistentParticlesCommonPluginInfo : public virtual CommonOperatorPluginInfo, public virtual PersistentParticlesGeneralPluginInfo
{
  public:
    virtual AttributeSubject *AllocAttributes();
    virtual void CopyAttributes(AttributeSubject *to, AttributeSubject *from);
};

class PersistentParticlesGUIPluginInfo : public virtual GUIOperatorPluginInfo, public virtual PersistentParticlesCommonPluginInfo
{
  public:
    virtual QString *GetMenuName() const;
    virtual QvisPostableWindowObserver *CreatePluginWindow(int type,
        AttributeSubject *attr, const QString &caption, const QString &shortName,
        QvisNotepadArea *notepad);
    virtual const char **XPMIconData() const;
};

class PersistentParticlesViewerEnginePluginInfo : public virtual ViewerEngineOperatorPluginInfo, public virtual PersistentParticlesCommonPluginInfo
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
    static PersistentParticlesAttributes *defaultAtts;
    static PersistentParticlesAttributes *clientAtts;
};

class PersistentParticlesViewerPluginInfo : public virtual ViewerOperatorPluginInfo, public virtual PersistentParticlesViewerEnginePluginInfo
{
  public:
    virtual const char **XPMIconData() const;
};

class PersistentParticlesEnginePluginInfo : public virtual EngineOperatorPluginInfo, public virtual PersistentParticlesViewerEnginePluginInfo
{
  public:
    virtual avtPluginFilter *AllocAvtPluginFilter();
};

class PersistentParticlesScriptingPluginInfo : public virtual ScriptingOperatorPluginInfo, public virtual PersistentParticlesCommonPluginInfo
{
  public:
    virtual void InitializePlugin(AttributeSubject *subj, void *data);
    virtual void *GetMethodTable(int *nMethods);
    virtual bool TypesMatch(void *pyobject);
    virtual char *GetLogString();
    virtual void SetDefaults(const AttributeSubject *atts);
};

#endif
