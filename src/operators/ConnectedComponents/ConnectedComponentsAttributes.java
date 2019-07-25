// Copyright (c) Lawrence Livermore National Security, LLC and other VisIt
// Project developers.  See the top-level LICENSE file for dates and other
// details.  No copyright assignment is required to contribute to VisIt.

package llnl.visit.operators;

import llnl.visit.AttributeSubject;
import llnl.visit.CommunicationBuffer;
import llnl.visit.Plugin;

// ****************************************************************************
// Class: ConnectedComponentsAttributes
//
// Purpose:
//    Attributes for Connected Components operator
//
// Notes:      Autogenerated by xml2java.
//
// Programmer: xml2java
// Creation:   omitted
//
// Modifications:
//   
// ****************************************************************************

public class ConnectedComponentsAttributes extends AttributeSubject implements Plugin
{
    private static int ConnectedComponentsAttributes_numAdditionalAtts = 1;

    public ConnectedComponentsAttributes()
    {
        super(ConnectedComponentsAttributes_numAdditionalAtts);

        EnableGhostNeighborsOptimization = true;
    }

    public ConnectedComponentsAttributes(int nMoreFields)
    {
        super(ConnectedComponentsAttributes_numAdditionalAtts + nMoreFields);

        EnableGhostNeighborsOptimization = true;
    }

    public ConnectedComponentsAttributes(ConnectedComponentsAttributes obj)
    {
        super(obj);

        EnableGhostNeighborsOptimization = obj.EnableGhostNeighborsOptimization;

        SelectAll();
    }

    public int Offset()
    {
        return super.Offset() + super.GetNumAdditionalAttributes();
    }

    public int GetNumAdditionalAttributes()
    {
        return ConnectedComponentsAttributes_numAdditionalAtts;
    }

    public boolean equals(ConnectedComponentsAttributes obj)
    {
        // Create the return value
        return ((EnableGhostNeighborsOptimization == obj.EnableGhostNeighborsOptimization));
    }

    public String GetName() { return "ConnectedComponents"; }
    public String GetVersion() { return "1.0"; }

    // Property setting methods
    public void SetEnableGhostNeighborsOptimization(boolean EnableGhostNeighborsOptimization_)
    {
        EnableGhostNeighborsOptimization = EnableGhostNeighborsOptimization_;
        Select(0);
    }

    // Property getting methods
    public boolean GetEnableGhostNeighborsOptimization() { return EnableGhostNeighborsOptimization; }

    // Write and read methods.
    public void WriteAtts(CommunicationBuffer buf)
    {
        if(WriteSelect(0, buf))
            buf.WriteBool(EnableGhostNeighborsOptimization);
    }

    public void ReadAtts(int index, CommunicationBuffer buf)
    {
        SetEnableGhostNeighborsOptimization(buf.ReadBool());
    }

    public String toString(String indent)
    {
        String str = new String();
        str = str + boolToString("EnableGhostNeighborsOptimization", EnableGhostNeighborsOptimization, indent) + "\n";
        return str;
    }


    // Attributes
    private boolean EnableGhostNeighborsOptimization;
}

