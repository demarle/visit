/*****************************************************************************
*
* Copyright (c) 2000 - 2017, Lawrence Livermore National Security, LLC
* Produced at the Lawrence Livermore National Laboratory
* LLNL-CODE-442911
* All rights reserved.
*
* This file is  part of VisIt. For  details, see https://visit.llnl.gov/.  The
* full copyright notice is contained in the file COPYRIGHT located at the root
* of the VisIt distribution or at http://www.llnl.gov/visit/copyright.html.
*
* Redistribution  and  use  in  source  and  binary  forms,  with  or  without
* modification, are permitted provided that the following conditions are met:
*
*  - Redistributions of  source code must  retain the above  copyright notice,
*    this list of conditions and the disclaimer below.
*  - Redistributions in binary form must reproduce the above copyright notice,
*    this  list of  conditions  and  the  disclaimer (as noted below)  in  the
*    documentation and/or other materials provided with the distribution.
*  - Neither the name of  the LLNS/LLNL nor the names of  its contributors may
*    be used to endorse or promote products derived from this software without
*    specific prior written permission.
*
* THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT  HOLDERS AND CONTRIBUTORS "AS IS"
* AND ANY EXPRESS OR  IMPLIED WARRANTIES, INCLUDING,  BUT NOT  LIMITED TO, THE
* IMPLIED WARRANTIES OF MERCHANTABILITY AND  FITNESS FOR A PARTICULAR  PURPOSE
* ARE  DISCLAIMED. IN  NO EVENT  SHALL LAWRENCE  LIVERMORE NATIONAL  SECURITY,
* LLC, THE  U.S.  DEPARTMENT OF  ENERGY  OR  CONTRIBUTORS BE  LIABLE  FOR  ANY
* DIRECT,  INDIRECT,   INCIDENTAL,   SPECIAL,   EXEMPLARY,  OR   CONSEQUENTIAL
* DAMAGES (INCLUDING, BUT NOT  LIMITED TO, PROCUREMENT OF  SUBSTITUTE GOODS OR
* SERVICES; LOSS OF  USE, DATA, OR PROFITS; OR  BUSINESS INTERRUPTION) HOWEVER
* CAUSED  AND  ON  ANY  THEORY  OF  LIABILITY,  WHETHER  IN  CONTRACT,  STRICT
* LIABILITY, OR TORT  (INCLUDING NEGLIGENCE OR OTHERWISE)  ARISING IN ANY  WAY
* OUT OF THE  USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH
* DAMAGE.
*
*****************************************************************************/

#ifndef WINDOWINFORMATION_H
#define WINDOWINFORMATION_H
#include <state_exports.h>
#include <string>
#include <AttributeSubject.h>


// ****************************************************************************
// Class: WindowInformation
//
// Purpose:
//    This class contains the attributes that tell the state of a viewer window.
//
// Notes:      Autogenerated by xml2atts.
//
// Programmer: xml2atts
// Creation:   omitted
//
// Modifications:
//   
// ****************************************************************************

class STATE_API WindowInformation : public AttributeSubject
{
public:
    // These constructors are for objects of this class
    WindowInformation();
    WindowInformation(const WindowInformation &obj);
protected:
    // These constructors are for objects derived from this class
    WindowInformation(private_tmfs_t tmfs);
    WindowInformation(const WindowInformation &obj, private_tmfs_t tmfs);
public:
    virtual ~WindowInformation();

    virtual WindowInformation& operator = (const WindowInformation &obj);
    virtual bool operator == (const WindowInformation &obj) const;
    virtual bool operator != (const WindowInformation &obj) const;
private:
    void Init();
    void Copy(const WindowInformation &obj);
public:

    virtual const std::string TypeName() const;
    virtual bool CopyAttributes(const AttributeGroup *);
    virtual AttributeSubject *CreateCompatible(const std::string &) const;
    virtual AttributeSubject *NewInstance(bool) const;

    // Property selection methods
    virtual void SelectAll();
    void SelectActiveSource();
    void SelectTimeSliders();
    void SelectTimeSliderCurrentStates();
    void SelectViewKeyframes();
    void SelectExtents();
    void SelectWindowSize();

    // Property setting methods
    void SetActiveSource(const std::string &activeSource_);
    void SetActiveTimeSlider(int activeTimeSlider_);
    void SetTimeSliders(const stringVector &timeSliders_);
    void SetTimeSliderCurrentStates(const intVector &timeSliderCurrentStates_);
    void SetAnimationMode(int animationMode_);
    void SetInteractionMode(int interactionMode_);
    void SetToolUpdateMode(int toolUpdateMode_);
    void SetBoundingBoxNavigate(bool boundingBoxNavigate_);
    void SetSpin(bool spin_);
    void SetFullFrame(bool fullFrame_);
    void SetPerspective(bool perspective_);
    void SetMaintainView(bool maintainView_);
    void SetLockView(bool lockView_);
    void SetLockTools(bool lockTools_);
    void SetLockTime(bool lockTime_);
    void SetViewExtentsType(int viewExtentsType_);
    void SetViewDimension(int viewDimension_);
    void SetViewKeyframes(const intVector &viewKeyframes_);
    void SetCameraViewMode(bool cameraViewMode_);
    void SetUsingScalableRendering(bool usingScalableRendering_);
    void SetLastRenderMin(float lastRenderMin_);
    void SetLastRenderAvg(float lastRenderAvg_);
    void SetLastRenderMax(float lastRenderMax_);
    void SetNumPrimitives(int numPrimitives_);
    void SetExtents(const double *extents_);
    void SetWindowSize(const int *windowSize_);
    void SetWinMode(int winMode_);
    void SetDDTSim(bool DDTSim_);
    void SetDDTConnected(bool DDTConnected_);

    // Property getting methods
    const std::string  &GetActiveSource() const;
          std::string  &GetActiveSource();
    int                GetActiveTimeSlider() const;
    const stringVector &GetTimeSliders() const;
          stringVector &GetTimeSliders();
    const intVector    &GetTimeSliderCurrentStates() const;
          intVector    &GetTimeSliderCurrentStates();
    int                GetAnimationMode() const;
    int                GetInteractionMode() const;
    int                GetToolUpdateMode() const;
    bool               GetBoundingBoxNavigate() const;
    bool               GetSpin() const;
    bool               GetFullFrame() const;
    bool               GetPerspective() const;
    bool               GetMaintainView() const;
    bool               GetLockView() const;
    bool               GetLockTools() const;
    bool               GetLockTime() const;
    int                GetViewExtentsType() const;
    int                GetViewDimension() const;
    const intVector    &GetViewKeyframes() const;
          intVector    &GetViewKeyframes();
    bool               GetCameraViewMode() const;
    bool               GetUsingScalableRendering() const;
    float              GetLastRenderMin() const;
    float              GetLastRenderAvg() const;
    float              GetLastRenderMax() const;
    int                GetNumPrimitives() const;
    const double       *GetExtents() const;
          double       *GetExtents();
    const int          *GetWindowSize() const;
          int          *GetWindowSize();
    int                GetWinMode() const;
    bool               GetDDTSim() const;
    bool               GetDDTConnected() const;

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
        ID_activeSource = 0,
        ID_activeTimeSlider,
        ID_timeSliders,
        ID_timeSliderCurrentStates,
        ID_animationMode,
        ID_interactionMode,
        ID_toolUpdateMode,
        ID_boundingBoxNavigate,
        ID_spin,
        ID_fullFrame,
        ID_perspective,
        ID_maintainView,
        ID_lockView,
        ID_lockTools,
        ID_lockTime,
        ID_viewExtentsType,
        ID_viewDimension,
        ID_viewKeyframes,
        ID_cameraViewMode,
        ID_usingScalableRendering,
        ID_lastRenderMin,
        ID_lastRenderAvg,
        ID_lastRenderMax,
        ID_numPrimitives,
        ID_extents,
        ID_windowSize,
        ID_winMode,
        ID_DDTSim,
        ID_DDTConnected,
        ID__LAST
    };

private:
    std::string  activeSource;
    int          activeTimeSlider;
    stringVector timeSliders;
    intVector    timeSliderCurrentStates;
    int          animationMode;
    int          interactionMode;
    int          toolUpdateMode;
    bool         boundingBoxNavigate;
    bool         spin;
    bool         fullFrame;
    bool         perspective;
    bool         maintainView;
    bool         lockView;
    bool         lockTools;
    bool         lockTime;
    int          viewExtentsType;
    int          viewDimension;
    intVector    viewKeyframes;
    bool         cameraViewMode;
    bool         usingScalableRendering;
    float        lastRenderMin;
    float        lastRenderAvg;
    float        lastRenderMax;
    int          numPrimitives;
    double       extents[6];
    int          windowSize[2];
    int          winMode;
    bool         DDTSim;
    bool         DDTConnected;

    // Static class format string for type map.
    static const char *TypeMapFormatString;
    static const private_tmfs_t TmfsStruct;
};
#define WINDOWINFORMATION_TMFS "sis*i*iiibbbbbbbbiii*bbfffiDIibb"

#endif
