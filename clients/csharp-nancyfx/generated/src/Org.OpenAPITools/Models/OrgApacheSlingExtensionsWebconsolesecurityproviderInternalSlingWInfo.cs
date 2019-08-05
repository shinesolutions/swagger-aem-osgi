using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo
    /// </summary>
    public sealed class OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo:  IEquatable<OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo>
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
        public OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo()
        {
        }

        private OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo(string Pid, string Title, string Description, OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo.
        /// </summary>
        /// <returns>OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfoBuilder</returns>
        public static OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfoBuilder Builder()
        {
            return new OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfoBuilder</returns>
        public OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfoBuilder With()
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

        public bool Equals(OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo</param>
        /// <param name="right">Compared (OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo left, OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo</param>
        /// <param name="right">Compared (OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo left, OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo.
        /// </summary>
        public sealed class OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties _Properties;

            internal OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfoBuilder Properties(OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo.
            /// </summary>
            /// <returns>OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo</returns>
            public OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo Build()
            {
                Validate();
                return new OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo(
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