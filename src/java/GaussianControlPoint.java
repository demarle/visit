// Copyright (c) Lawrence Livermore National Security, LLC and other VisIt
// Project developers.  See the top-level LICENSE file for dates and other
// details.  No copyright assignment is required to contribute to VisIt.

package llnl.visit;


// ****************************************************************************
// Class: GaussianControlPoint
//
// Purpose:
//    This class contains the information for a gaussian in the opacity bar.
//
// Notes:      Autogenerated by xml2java.
//
// Programmer: xml2java
// Creation:   omitted
//
// Modifications:
//   
// ****************************************************************************

public class GaussianControlPoint extends AttributeSubject
{
    private static int GaussianControlPoint_numAdditionalAtts = 5;

    public GaussianControlPoint()
    {
        super(GaussianControlPoint_numAdditionalAtts);

        x = 0f;
        height = 0f;
        width = 0.001f;
        xBias = 0f;
        yBias = 0f;
    }

    public GaussianControlPoint(int nMoreFields)
    {
        super(GaussianControlPoint_numAdditionalAtts + nMoreFields);

        x = 0f;
        height = 0f;
        width = 0.001f;
        xBias = 0f;
        yBias = 0f;
    }

    public GaussianControlPoint(GaussianControlPoint obj)
    {
        super(obj);

        x = obj.x;
        height = obj.height;
        width = obj.width;
        xBias = obj.xBias;
        yBias = obj.yBias;

        SelectAll();
    }

    public int Offset()
    {
        return super.Offset() + super.GetNumAdditionalAttributes();
    }

    public int GetNumAdditionalAttributes()
    {
        return GaussianControlPoint_numAdditionalAtts;
    }

    public boolean equals(GaussianControlPoint obj)
    {
        // Create the return value
        return ((x == obj.x) &&
                (height == obj.height) &&
                (width == obj.width) &&
                (xBias == obj.xBias) &&
                (yBias == obj.yBias));
    }

    // Property setting methods
    public void SetX(float x_)
    {
        x = x_;
        Select(0);
    }

    public void SetHeight(float height_)
    {
        height = height_;
        Select(1);
    }

    public void SetWidth(float width_)
    {
        width = width_;
        Select(2);
    }

    public void SetXBias(float xBias_)
    {
        xBias = xBias_;
        Select(3);
    }

    public void SetYBias(float yBias_)
    {
        yBias = yBias_;
        Select(4);
    }

    // Property getting methods
    public float GetX() { return x; }
    public float GetHeight() { return height; }
    public float GetWidth() { return width; }
    public float GetXBias() { return xBias; }
    public float GetYBias() { return yBias; }

    // Write and read methods.
    public void WriteAtts(CommunicationBuffer buf)
    {
        if(WriteSelect(0, buf))
            buf.WriteFloat(x);
        if(WriteSelect(1, buf))
            buf.WriteFloat(height);
        if(WriteSelect(2, buf))
            buf.WriteFloat(width);
        if(WriteSelect(3, buf))
            buf.WriteFloat(xBias);
        if(WriteSelect(4, buf))
            buf.WriteFloat(yBias);
    }

    public void ReadAtts(int index, CommunicationBuffer buf)
    {
        switch(index)
        {
        case 0:
            SetX(buf.ReadFloat());
            break;
        case 1:
            SetHeight(buf.ReadFloat());
            break;
        case 2:
            SetWidth(buf.ReadFloat());
            break;
        case 3:
            SetXBias(buf.ReadFloat());
            break;
        case 4:
            SetYBias(buf.ReadFloat());
            break;
        }
    }

    public String toString(String indent)
    {
        String str = new String();
        str = str + floatToString("x", x, indent) + "\n";
        str = str + floatToString("height", height, indent) + "\n";
        str = str + floatToString("width", width, indent) + "\n";
        str = str + floatToString("xBias", xBias, indent) + "\n";
        str = str + floatToString("yBias", yBias, indent) + "\n";
        return str;
    }


    // Attributes
    private float x;
    private float height;
    private float width;
    private float xBias;
    private float yBias;
}

