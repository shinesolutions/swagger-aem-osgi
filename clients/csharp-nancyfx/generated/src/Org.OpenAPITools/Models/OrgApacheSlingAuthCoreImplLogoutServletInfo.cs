using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingAuthCoreImplLogoutServletInfo
    /// </summary>
    public sealed class OrgApacheSlingAuthCoreImplLogoutServletInfo:  IEquatable<OrgApacheSlingAuthCoreImplLogoutServletInfo>
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
        public OrgApacheSlingAuthCoreImplLogoutServletProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingAuthCoreImplLogoutServletInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingAuthCoreImplLogoutServletInfo()
        {
        }

        private OrgApacheSlingAuthCoreImplLogoutServletInfo(string Pid, string Title, string Description, OrgApacheSlingAuthCoreImplLogoutServletProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingAuthCoreImplLogoutServletInfo.
        /// </summary>
        /// <returns>OrgApacheSlingAuthCoreImplLogoutServletInfoBuilder</returns>
        public static OrgApacheSlingAuthCoreImplLogoutServletInfoBuilder Builder()
        {
            return new OrgApacheSlingAuthCoreImplLogoutServletInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingAuthCoreImplLogoutServletInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingAuthCoreImplLogoutServletInfoBuilder</returns>
        public OrgApacheSlingAuthCoreImplLogoutServletInfoBuilder With()
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

        public bool Equals(OrgApacheSlingAuthCoreImplLogoutServletInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingAuthCoreImplLogoutServletInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingAuthCoreImplLogoutServletInfo</param>
        /// <param name="right">Compared (OrgApacheSlingAuthCoreImplLogoutServletInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingAuthCoreImplLogoutServletInfo left, OrgApacheSlingAuthCoreImplLogoutServletInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingAuthCoreImplLogoutServletInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingAuthCoreImplLogoutServletInfo</param>
        /// <param name="right">Compared (OrgApacheSlingAuthCoreImplLogoutServletInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingAuthCoreImplLogoutServletInfo left, OrgApacheSlingAuthCoreImplLogoutServletInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingAuthCoreImplLogoutServletInfo.
        /// </summary>
        public sealed class OrgApacheSlingAuthCoreImplLogoutServletInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingAuthCoreImplLogoutServletProperties _Properties;

            internal OrgApacheSlingAuthCoreImplLogoutServletInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingAuthCoreImplLogoutServletInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingAuthCoreImplLogoutServletInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingAuthCoreImplLogoutServletInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingAuthCoreImplLogoutServletInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingAuthCoreImplLogoutServletInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingAuthCoreImplLogoutServletInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingAuthCoreImplLogoutServletInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingAuthCoreImplLogoutServletInfoBuilder Properties(OrgApacheSlingAuthCoreImplLogoutServletProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingAuthCoreImplLogoutServletInfo.
            /// </summary>
            /// <returns>OrgApacheSlingAuthCoreImplLogoutServletInfo</returns>
            public OrgApacheSlingAuthCoreImplLogoutServletInfo Build()
            {
                Validate();
                return new OrgApacheSlingAuthCoreImplLogoutServletInfo(
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