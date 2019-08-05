using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo
    /// </summary>
    public sealed class OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo:  IEquatable<OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo>
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
        public OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo()
        {
        }

        private OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo(string Pid, string Title, string Description, OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo.
        /// </summary>
        /// <returns>OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfoBuilder</returns>
        public static OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfoBuilder Builder()
        {
            return new OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfoBuilder</returns>
        public OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfoBuilder With()
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

        public bool Equals(OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo</param>
        /// <param name="right">Compared (OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo left, OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo</param>
        /// <param name="right">Compared (OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo left, OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo.
        /// </summary>
        public sealed class OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties _Properties;

            internal OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfoBuilder Properties(OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo.
            /// </summary>
            /// <returns>OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo</returns>
            public OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo Build()
            {
                Validate();
                return new OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo(
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