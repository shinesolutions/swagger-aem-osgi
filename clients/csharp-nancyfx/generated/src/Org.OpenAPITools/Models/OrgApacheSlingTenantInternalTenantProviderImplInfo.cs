using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingTenantInternalTenantProviderImplInfo
    /// </summary>
    public sealed class OrgApacheSlingTenantInternalTenantProviderImplInfo:  IEquatable<OrgApacheSlingTenantInternalTenantProviderImplInfo>
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
        public OrgApacheSlingTenantInternalTenantProviderImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingTenantInternalTenantProviderImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingTenantInternalTenantProviderImplInfo()
        {
        }

        private OrgApacheSlingTenantInternalTenantProviderImplInfo(string Pid, string Title, string Description, OrgApacheSlingTenantInternalTenantProviderImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingTenantInternalTenantProviderImplInfo.
        /// </summary>
        /// <returns>OrgApacheSlingTenantInternalTenantProviderImplInfoBuilder</returns>
        public static OrgApacheSlingTenantInternalTenantProviderImplInfoBuilder Builder()
        {
            return new OrgApacheSlingTenantInternalTenantProviderImplInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingTenantInternalTenantProviderImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingTenantInternalTenantProviderImplInfoBuilder</returns>
        public OrgApacheSlingTenantInternalTenantProviderImplInfoBuilder With()
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

        public bool Equals(OrgApacheSlingTenantInternalTenantProviderImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingTenantInternalTenantProviderImplInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingTenantInternalTenantProviderImplInfo</param>
        /// <param name="right">Compared (OrgApacheSlingTenantInternalTenantProviderImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingTenantInternalTenantProviderImplInfo left, OrgApacheSlingTenantInternalTenantProviderImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingTenantInternalTenantProviderImplInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingTenantInternalTenantProviderImplInfo</param>
        /// <param name="right">Compared (OrgApacheSlingTenantInternalTenantProviderImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingTenantInternalTenantProviderImplInfo left, OrgApacheSlingTenantInternalTenantProviderImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingTenantInternalTenantProviderImplInfo.
        /// </summary>
        public sealed class OrgApacheSlingTenantInternalTenantProviderImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingTenantInternalTenantProviderImplProperties _Properties;

            internal OrgApacheSlingTenantInternalTenantProviderImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingTenantInternalTenantProviderImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingTenantInternalTenantProviderImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingTenantInternalTenantProviderImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingTenantInternalTenantProviderImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingTenantInternalTenantProviderImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingTenantInternalTenantProviderImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingTenantInternalTenantProviderImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingTenantInternalTenantProviderImplInfoBuilder Properties(OrgApacheSlingTenantInternalTenantProviderImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingTenantInternalTenantProviderImplInfo.
            /// </summary>
            /// <returns>OrgApacheSlingTenantInternalTenantProviderImplInfo</returns>
            public OrgApacheSlingTenantInternalTenantProviderImplInfo Build()
            {
                Validate();
                return new OrgApacheSlingTenantInternalTenantProviderImplInfo(
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