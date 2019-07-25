// Copyright (c) Lawrence Livermore National Security, LLC and other VisIt
// Project developers.  See the top-level LICENSE file for dates and other
// details.  No copyright assignment is required to contribute to VisIt.

package llnl.visit.operators;

import llnl.visit.AttributeSubject;
import llnl.visit.CommunicationBuffer;
import llnl.visit.Plugin;

// ****************************************************************************
// Class: EdgeAttributes
//
// Purpose:
//    Attributes for the Edge operator
//
// Notes:      Autogenerated by xml2java.
//
// Programmer: xml2java
// Creation:   omitted
//
// Modifications:
//   
// ****************************************************************************

public class EdgeAttributes extends AttributeSubject implements Plugin
{
    private static int EdgeAttributes_numAdditionalAtts = 1;

    public EdgeAttributes()
    {
        super(EdgeAttributes_numAdditionalAtts);

        dummy = true;
    }

    public EdgeAttributes(int nMoreFields)
    {
        super(EdgeAttributes_numAdditionalAtts + nMoreFields);

        dummy = true;
    }

    public EdgeAttributes(EdgeAttributes obj)
    {
        super(obj);

        dummy = obj.dummy;

        SelectAll();
    }

    public int Offset()
    {
        return super.Offset() + super.GetNumAdditionalAttributes();
    }

    public int GetNumAdditionalAttributes()
    {
        return EdgeAttributes_numAdditionalAtts;
    }

    public boolean equals(EdgeAttributes obj)
    {
        // Create the return value
        return ((dummy == obj.dummy));
    }

    public String GetName() { return "Edge"; }
    public String GetVersion() { return "1.0"; }

    // Property setting methods
    public void SetDummy(boolean dummy_)
    {
        dummy = dummy_;
        Select(0);
    }

    // Property getting methods
    public boolean GetDummy() { return dummy; }

    // Write and read methods.
    public void WriteAtts(CommunicationBuffer buf)
    {
        if(WriteSelect(0, buf))
            buf.WriteBool(dummy);
    }

    public void ReadAtts(int index, CommunicationBuffer buf)
    {
        SetDummy(buf.ReadBool());
    }

    public String toString(String indent)
    {
        String str = new String();
        str = str + boolToString("dummy", dummy, indent) + "\n";
        return str;
    }


    // Attributes
    private boolean dummy;
}

