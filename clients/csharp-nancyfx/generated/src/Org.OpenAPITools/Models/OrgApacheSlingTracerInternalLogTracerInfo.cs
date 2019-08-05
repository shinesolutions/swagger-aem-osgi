using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingTracerInternalLogTracerInfo
    /// </summary>
    public sealed class OrgApacheSlingTracerInternalLogTracerInfo:  IEquatable<OrgApacheSlingTracerInternalLogTracerInfo>
    { 
        /// <summary>
        /// Pid
        /// </summary>
        public string Pid { get; private set; }

        /// <summary>
        /// Title
        /// </summary>
        public string Title { get; private set; }

        /// <summary>
        /// Description
        /// </summary>
        public string Description { get; private set; }

        /// <summary>
        /// Properties
        /// </summary>
        public OrgApacheSlingTracerInternalLogTracerProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingTracerInternalLogTracerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingTracerInternalLogTracerInfo()
        {
        }

        private OrgApacheSlingTracerInternalLogTracerInfo(string Pid, string Title, string Description, OrgApacheSlingTracerInternalLogTracerProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingTracerInternalLogTracerInfo.
        /// </summary>
        /// <returns>OrgApacheSlingTracerInternalLogTracerInfoBuilder</returns>
        public static OrgApacheSlingTracerInternalLogTracerInfoBuilder Builder()
        {
            return new OrgApacheSlingTracerInternalLogTracerInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingTracerInternalLogTracerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingTracerInternalLogTracerInfoBuilder</returns>
        public OrgApacheSlingTracerInternalLogTracerInfoBuilder With()
        {
            return Builder()
                .Pid(Pid)
                .Title(Title)
                .Description(Description)
                .Properties(Properties);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingTracerInternalLogTracerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingTracerInternalLogTracerInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingTracerInternalLogTracerInfo</param>
        /// <param name="right">Compared (OrgApacheSlingTracerInternalLogTracerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingTracerInternalLogTracerInfo left, OrgApacheSlingTracerInternalLogTracerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingTracerInternalLogTracerInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingTracerInternalLogTracerInfo</param>
        /// <param name="right">Compared (OrgApacheSlingTracerInternalLogTracerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingTracerInternalLogTracerInfo left, OrgApacheSlingTracerInternalLogTracerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingTracerInternalLogTracerInfo.
        /// </summary>
        public sealed class OrgApacheSlingTracerInternalLogTracerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingTracerInternalLogTracerProperties _Properties;

            internal OrgApacheSlingTracerInternalLogTracerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingTracerInternalLogTracerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingTracerInternalLogTracerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingTracerInternalLogTracerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingTracerInternalLogTracerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingTracerInternalLogTracerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingTracerInternalLogTracerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingTracerInternalLogTracerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingTracerInternalLogTracerInfoBuilder Properties(OrgApacheSlingTracerInternalLogTracerProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingTracerInternalLogTracerInfo.
            /// </summary>
            /// <returns>OrgApacheSlingTracerInternalLogTracerInfo</returns>
            public OrgApacheSlingTracerInternalLogTracerInfo Build()
            {
                Validate();
                return new OrgApacheSlingTracerInternalLogTracerInfo(
                    Pid: _Pid,
                    Title: _Title,
                    Description: _Description,
                    Properties: _Properties
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}