using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingServletsGetImplVersionVersionInfoServletInfo
    /// </summary>
    public sealed class OrgApacheSlingServletsGetImplVersionVersionInfoServletInfo:  IEquatable<OrgApacheSlingServletsGetImplVersionVersionInfoServletInfo>
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
        public OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingServletsGetImplVersionVersionInfoServletInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingServletsGetImplVersionVersionInfoServletInfo()
        {
        }

        private OrgApacheSlingServletsGetImplVersionVersionInfoServletInfo(string Pid, string Title, string Description, OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingServletsGetImplVersionVersionInfoServletInfo.
        /// </summary>
        /// <returns>OrgApacheSlingServletsGetImplVersionVersionInfoServletInfoBuilder</returns>
        public static OrgApacheSlingServletsGetImplVersionVersionInfoServletInfoBuilder Builder()
        {
            return new OrgApacheSlingServletsGetImplVersionVersionInfoServletInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingServletsGetImplVersionVersionInfoServletInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingServletsGetImplVersionVersionInfoServletInfoBuilder</returns>
        public OrgApacheSlingServletsGetImplVersionVersionInfoServletInfoBuilder With()
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

        public bool Equals(OrgApacheSlingServletsGetImplVersionVersionInfoServletInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingServletsGetImplVersionVersionInfoServletInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingServletsGetImplVersionVersionInfoServletInfo</param>
        /// <param name="right">Compared (OrgApacheSlingServletsGetImplVersionVersionInfoServletInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingServletsGetImplVersionVersionInfoServletInfo left, OrgApacheSlingServletsGetImplVersionVersionInfoServletInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingServletsGetImplVersionVersionInfoServletInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingServletsGetImplVersionVersionInfoServletInfo</param>
        /// <param name="right">Compared (OrgApacheSlingServletsGetImplVersionVersionInfoServletInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingServletsGetImplVersionVersionInfoServletInfo left, OrgApacheSlingServletsGetImplVersionVersionInfoServletInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingServletsGetImplVersionVersionInfoServletInfo.
        /// </summary>
        public sealed class OrgApacheSlingServletsGetImplVersionVersionInfoServletInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties _Properties;

            internal OrgApacheSlingServletsGetImplVersionVersionInfoServletInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingServletsGetImplVersionVersionInfoServletInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingServletsGetImplVersionVersionInfoServletInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingServletsGetImplVersionVersionInfoServletInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingServletsGetImplVersionVersionInfoServletInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingServletsGetImplVersionVersionInfoServletInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingServletsGetImplVersionVersionInfoServletInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingServletsGetImplVersionVersionInfoServletInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingServletsGetImplVersionVersionInfoServletInfoBuilder Properties(OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingServletsGetImplVersionVersionInfoServletInfo.
            /// </summary>
            /// <returns>OrgApacheSlingServletsGetImplVersionVersionInfoServletInfo</returns>
            public OrgApacheSlingServletsGetImplVersionVersionInfoServletInfo Build()
            {
                Validate();
                return new OrgApacheSlingServletsGetImplVersionVersionInfoServletInfo(
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