// Copyright (c) Lawrence Livermore National Security, LLC and other VisIt
// Project developers.  See the top-level LICENSE file for dates and other
// details.  No copyright assignment is required to contribute to VisIt.

package llnl.visit.operators;

import llnl.visit.AttributeSubject;
import llnl.visit.CommunicationBuffer;
import llnl.visit.Plugin;

// ****************************************************************************
// Class: ExtrudeAttributes
//
// Purpose:
//    This class contains attributes for the extrude operator.
//
// Notes:      Autogenerated by xml2java.
//
// Programmer: xml2java
// Creation:   omitted
//
// Modifications:
//   
// ****************************************************************************

public class ExtrudeAttributes extends AttributeSubject implements Plugin
{
    private static int ExtrudeAttributes_numAdditionalAtts = 6;

    public ExtrudeAttributes()
    {
        super(ExtrudeAttributes_numAdditionalAtts);

        axis = new double[3];
        axis[0] = 0;
        axis[1] = 0;
        axis[2] = 1;
        byVariable = false;
        variable = new String("default");
        length = 1;
        steps = 1;
        preserveOriginalCellNumbers = true;
    }

    public ExtrudeAttributes(int nMoreFields)
    {
        super(ExtrudeAttributes_numAdditionalAtts + nMoreFields);

        axis = new double[3];
        axis[0] = 0;
        axis[1] = 0;
        axis[2] = 1;
        byVariable = false;
        variable = new String("default");
        length = 1;
        steps = 1;
        preserveOriginalCellNumbers = true;
    }

    public ExtrudeAttributes(ExtrudeAttributes obj)
    {
        super(obj);

        int i;

        axis = new double[3];
        axis[0] = obj.axis[0];
        axis[1] = obj.axis[1];
        axis[2] = obj.axis[2];

        byVariable = obj.byVariable;
        variable = new String(obj.variable);
        length = obj.length;
        steps = obj.steps;
        preserveOriginalCellNumbers = obj.preserveOriginalCellNumbers;

        SelectAll();
    }

    public int Offset()
    {
        return super.Offset() + super.GetNumAdditionalAttributes();
    }

    public int GetNumAdditionalAttributes()
    {
        return ExtrudeAttributes_numAdditionalAtts;
    }

    public boolean equals(ExtrudeAttributes obj)
    {
        int i;

        // Compare the axis arrays.
        boolean axis_equal = true;
        for(i = 0; i < 3 && axis_equal; ++i)
            axis_equal = (axis[i] == obj.axis[i]);

        // Create the return value
        return (axis_equal &&
                (byVariable == obj.byVariable) &&
                (variable.equals(obj.variable)) &&
                (length == obj.length) &&
                (steps == obj.steps) &&
                (preserveOriginalCellNumbers == obj.preserveOriginalCellNumbers));
    }

    public String GetName() { return "Extrude"; }
    public String GetVersion() { return "1.0"; }

    // Property setting methods
    public void SetAxis(double[] axis_)
    {
        axis[0] = axis_[0];
        axis[1] = axis_[1];
        axis[2] = axis_[2];
        Select(0);
    }

    public void SetAxis(double e0, double e1, double e2)
    {
        axis[0] = e0;
        axis[1] = e1;
        axis[2] = e2;
        Select(0);
    }

    public void SetByVariable(boolean byVariable_)
    {
        byVariable = byVariable_;
        Select(1);
    }

    public void SetVariable(String variable_)
    {
        variable = variable_;
        Select(2);
    }

    public void SetLength(double length_)
    {
        length = length_;
        Select(3);
    }

    public void SetSteps(int steps_)
    {
        steps = steps_;
        Select(4);
    }

    public void SetPreserveOriginalCellNumbers(boolean preserveOriginalCellNumbers_)
    {
        preserveOriginalCellNumbers = preserveOriginalCellNumbers_;
        Select(5);
    }

    // Property getting methods
    public double[] GetAxis() { return axis; }
    public boolean  GetByVariable() { return byVariable; }
    public String   GetVariable() { return variable; }
    public double   GetLength() { return length; }
    public int      GetSteps() { return steps; }
    public boolean  GetPreserveOriginalCellNumbers() { return preserveOriginalCellNumbers; }

    // Write and read methods.
    public void WriteAtts(CommunicationBuffer buf)
    {
        if(WriteSelect(0, buf))
            buf.WriteDoubleArray(axis);
        if(WriteSelect(1, buf))
            buf.WriteBool(byVariable);
        if(WriteSelect(2, buf))
            buf.WriteString(variable);
        if(WriteSelect(3, buf))
            buf.WriteDouble(length);
        if(WriteSelect(4, buf))
            buf.WriteInt(steps);
        if(WriteSelect(5, buf))
            buf.WriteBool(preserveOriginalCellNumbers);
    }

    public void ReadAtts(int index, CommunicationBuffer buf)
    {
        switch(index)
        {
        case 0:
            SetAxis(buf.ReadDoubleArray());
            break;
        case 1:
            SetByVariable(buf.ReadBool());
            break;
        case 2:
            SetVariable(buf.ReadString());
            break;
        case 3:
            SetLength(buf.ReadDouble());
            break;
        case 4:
            SetSteps(buf.ReadInt());
            break;
        case 5:
            SetPreserveOriginalCellNumbers(buf.ReadBool());
            break;
        }
    }

    public String toString(String indent)
    {
        String str = new String();
        str = str + doubleArrayToString("axis", axis, indent) + "\n";
        str = str + boolToString("byVariable", byVariable, indent) + "\n";
        str = str + stringToString("variable", variable, indent) + "\n";
        str = str + doubleToString("length", length, indent) + "\n";
        str = str + intToString("steps", steps, indent) + "\n";
        str = str + boolToString("preserveOriginalCellNumbers", preserveOriginalCellNumbers, indent) + "\n";
        return str;
    }


    // Attributes
    private double[] axis;
    private boolean  byVariable;
    private String   variable;
    private double   length;
    private int      steps;
    private boolean  preserveOriginalCellNumbers;
}

