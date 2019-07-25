// Copyright (c) Lawrence Livermore National Security, LLC and other VisIt
// Project developers.  See the top-level LICENSE file for dates and other
// details.  No copyright assignment is required to contribute to VisIt.

package llnl.visit;


// ****************************************************************************
// Class: LinearTransformAttributes
//
// Purpose:
//    This class contains attributes for the linear transform.
//
// Notes:      Autogenerated by xml2java.
//
// Programmer: xml2java
// Creation:   omitted
//
// Modifications:
//   
// ****************************************************************************

public class LinearTransformAttributes extends AttributeSubject
{
    private static int LinearTransformAttributes_numAdditionalAtts = 18;

    public LinearTransformAttributes()
    {
        super(LinearTransformAttributes_numAdditionalAtts);

        m00 = 1;
        m01 = 0;
        m02 = 0;
        m03 = 0;
        m10 = 0;
        m11 = 1;
        m12 = 0;
        m13 = 0;
        m20 = 0;
        m21 = 0;
        m22 = 1;
        m23 = 0;
        m30 = 0;
        m31 = 0;
        m32 = 0;
        m33 = 1;
        invertLinearTransform = false;
        transformVectors = true;
    }

    public LinearTransformAttributes(int nMoreFields)
    {
        super(LinearTransformAttributes_numAdditionalAtts + nMoreFields);

        m00 = 1;
        m01 = 0;
        m02 = 0;
        m03 = 0;
        m10 = 0;
        m11 = 1;
        m12 = 0;
        m13 = 0;
        m20 = 0;
        m21 = 0;
        m22 = 1;
        m23 = 0;
        m30 = 0;
        m31 = 0;
        m32 = 0;
        m33 = 1;
        invertLinearTransform = false;
        transformVectors = true;
    }

    public LinearTransformAttributes(LinearTransformAttributes obj)
    {
        super(obj);

        m00 = obj.m00;
        m01 = obj.m01;
        m02 = obj.m02;
        m03 = obj.m03;
        m10 = obj.m10;
        m11 = obj.m11;
        m12 = obj.m12;
        m13 = obj.m13;
        m20 = obj.m20;
        m21 = obj.m21;
        m22 = obj.m22;
        m23 = obj.m23;
        m30 = obj.m30;
        m31 = obj.m31;
        m32 = obj.m32;
        m33 = obj.m33;
        invertLinearTransform = obj.invertLinearTransform;
        transformVectors = obj.transformVectors;

        SelectAll();
    }

    public int Offset()
    {
        return super.Offset() + super.GetNumAdditionalAttributes();
    }

    public int GetNumAdditionalAttributes()
    {
        return LinearTransformAttributes_numAdditionalAtts;
    }

    public boolean equals(LinearTransformAttributes obj)
    {
        // Create the return value
        return ((m00 == obj.m00) &&
                (m01 == obj.m01) &&
                (m02 == obj.m02) &&
                (m03 == obj.m03) &&
                (m10 == obj.m10) &&
                (m11 == obj.m11) &&
                (m12 == obj.m12) &&
                (m13 == obj.m13) &&
                (m20 == obj.m20) &&
                (m21 == obj.m21) &&
                (m22 == obj.m22) &&
                (m23 == obj.m23) &&
                (m30 == obj.m30) &&
                (m31 == obj.m31) &&
                (m32 == obj.m32) &&
                (m33 == obj.m33) &&
                (invertLinearTransform == obj.invertLinearTransform) &&
                (transformVectors == obj.transformVectors));
    }

    // Property setting methods
    public void SetM00(double m00_)
    {
        m00 = m00_;
        Select(0);
    }

    public void SetM01(double m01_)
    {
        m01 = m01_;
        Select(1);
    }

    public void SetM02(double m02_)
    {
        m02 = m02_;
        Select(2);
    }

    public void SetM03(double m03_)
    {
        m03 = m03_;
        Select(3);
    }

    public void SetM10(double m10_)
    {
        m10 = m10_;
        Select(4);
    }

    public void SetM11(double m11_)
    {
        m11 = m11_;
        Select(5);
    }

    public void SetM12(double m12_)
    {
        m12 = m12_;
        Select(6);
    }

    public void SetM13(double m13_)
    {
        m13 = m13_;
        Select(7);
    }

    public void SetM20(double m20_)
    {
        m20 = m20_;
        Select(8);
    }

    public void SetM21(double m21_)
    {
        m21 = m21_;
        Select(9);
    }

    public void SetM22(double m22_)
    {
        m22 = m22_;
        Select(10);
    }

    public void SetM23(double m23_)
    {
        m23 = m23_;
        Select(11);
    }

    public void SetM30(double m30_)
    {
        m30 = m30_;
        Select(12);
    }

    public void SetM31(double m31_)
    {
        m31 = m31_;
        Select(13);
    }

    public void SetM32(double m32_)
    {
        m32 = m32_;
        Select(14);
    }

    public void SetM33(double m33_)
    {
        m33 = m33_;
        Select(15);
    }

    public void SetInvertLinearTransform(boolean invertLinearTransform_)
    {
        invertLinearTransform = invertLinearTransform_;
        Select(16);
    }

    public void SetTransformVectors(boolean transformVectors_)
    {
        transformVectors = transformVectors_;
        Select(17);
    }

    // Property getting methods
    public double  GetM00() { return m00; }
    public double  GetM01() { return m01; }
    public double  GetM02() { return m02; }
    public double  GetM03() { return m03; }
    public double  GetM10() { return m10; }
    public double  GetM11() { return m11; }
    public double  GetM12() { return m12; }
    public double  GetM13() { return m13; }
    public double  GetM20() { return m20; }
    public double  GetM21() { return m21; }
    public double  GetM22() { return m22; }
    public double  GetM23() { return m23; }
    public double  GetM30() { return m30; }
    public double  GetM31() { return m31; }
    public double  GetM32() { return m32; }
    public double  GetM33() { return m33; }
    public boolean GetInvertLinearTransform() { return invertLinearTransform; }
    public boolean GetTransformVectors() { return transformVectors; }

    // Write and read methods.
    public void WriteAtts(CommunicationBuffer buf)
    {
        if(WriteSelect(0, buf))
            buf.WriteDouble(m00);
        if(WriteSelect(1, buf))
            buf.WriteDouble(m01);
        if(WriteSelect(2, buf))
            buf.WriteDouble(m02);
        if(WriteSelect(3, buf))
            buf.WriteDouble(m03);
        if(WriteSelect(4, buf))
            buf.WriteDouble(m10);
        if(WriteSelect(5, buf))
            buf.WriteDouble(m11);
        if(WriteSelect(6, buf))
            buf.WriteDouble(m12);
        if(WriteSelect(7, buf))
            buf.WriteDouble(m13);
        if(WriteSelect(8, buf))
            buf.WriteDouble(m20);
        if(WriteSelect(9, buf))
            buf.WriteDouble(m21);
        if(WriteSelect(10, buf))
            buf.WriteDouble(m22);
        if(WriteSelect(11, buf))
            buf.WriteDouble(m23);
        if(WriteSelect(12, buf))
            buf.WriteDouble(m30);
        if(WriteSelect(13, buf))
            buf.WriteDouble(m31);
        if(WriteSelect(14, buf))
            buf.WriteDouble(m32);
        if(WriteSelect(15, buf))
            buf.WriteDouble(m33);
        if(WriteSelect(16, buf))
            buf.WriteBool(invertLinearTransform);
        if(WriteSelect(17, buf))
            buf.WriteBool(transformVectors);
    }

    public void ReadAtts(int index, CommunicationBuffer buf)
    {
        switch(index)
        {
        case 0:
            SetM00(buf.ReadDouble());
            break;
        case 1:
            SetM01(buf.ReadDouble());
            break;
        case 2:
            SetM02(buf.ReadDouble());
            break;
        case 3:
            SetM03(buf.ReadDouble());
            break;
        case 4:
            SetM10(buf.ReadDouble());
            break;
        case 5:
            SetM11(buf.ReadDouble());
            break;
        case 6:
            SetM12(buf.ReadDouble());
            break;
        case 7:
            SetM13(buf.ReadDouble());
            break;
        case 8:
            SetM20(buf.ReadDouble());
            break;
        case 9:
            SetM21(buf.ReadDouble());
            break;
        case 10:
            SetM22(buf.ReadDouble());
            break;
        case 11:
            SetM23(buf.ReadDouble());
            break;
        case 12:
            SetM30(buf.ReadDouble());
            break;
        case 13:
            SetM31(buf.ReadDouble());
            break;
        case 14:
            SetM32(buf.ReadDouble());
            break;
        case 15:
            SetM33(buf.ReadDouble());
            break;
        case 16:
            SetInvertLinearTransform(buf.ReadBool());
            break;
        case 17:
            SetTransformVectors(buf.ReadBool());
            break;
        }
    }

    public String toString(String indent)
    {
        String str = new String();
        str = str + doubleToString("m00", m00, indent) + "\n";
        str = str + doubleToString("m01", m01, indent) + "\n";
        str = str + doubleToString("m02", m02, indent) + "\n";
        str = str + doubleToString("m03", m03, indent) + "\n";
        str = str + doubleToString("m10", m10, indent) + "\n";
        str = str + doubleToString("m11", m11, indent) + "\n";
        str = str + doubleToString("m12", m12, indent) + "\n";
        str = str + doubleToString("m13", m13, indent) + "\n";
        str = str + doubleToString("m20", m20, indent) + "\n";
        str = str + doubleToString("m21", m21, indent) + "\n";
        str = str + doubleToString("m22", m22, indent) + "\n";
        str = str + doubleToString("m23", m23, indent) + "\n";
        str = str + doubleToString("m30", m30, indent) + "\n";
        str = str + doubleToString("m31", m31, indent) + "\n";
        str = str + doubleToString("m32", m32, indent) + "\n";
        str = str + doubleToString("m33", m33, indent) + "\n";
        str = str + boolToString("invertLinearTransform", invertLinearTransform, indent) + "\n";
        str = str + boolToString("transformVectors", transformVectors, indent) + "\n";
        return str;
    }


    // Attributes
    private double  m00;
    private double  m01;
    private double  m02;
    private double  m03;
    private double  m10;
    private double  m11;
    private double  m12;
    private double  m13;
    private double  m20;
    private double  m21;
    private double  m22;
    private double  m23;
    private double  m30;
    private double  m31;
    private double  m32;
    private double  m33;
    private boolean invertLinearTransform;
    private boolean transformVectors;
}

