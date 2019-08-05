using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingServletsPostImplSlingPostServletInfo
    /// </summary>
    public sealed class OrgApacheSlingServletsPostImplSlingPostServletInfo:  IEquatable<OrgApacheSlingServletsPostImplSlingPostServletInfo>
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
        public OrgApacheSlingServletsPostImplSlingPostServletProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingServletsPostImplSlingPostServletInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingServletsPostImplSlingPostServletInfo()
        {
        }

        private OrgApacheSlingServletsPostImplSlingPostServletInfo(string Pid, string Title, string Description, OrgApacheSlingServletsPostImplSlingPostServletProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingServletsPostImplSlingPostServletInfo.
        /// </summary>
        /// <returns>OrgApacheSlingServletsPostImplSlingPostServletInfoBuilder</returns>
        public static OrgApacheSlingServletsPostImplSlingPostServletInfoBuilder Builder()
        {
            return new OrgApacheSlingServletsPostImplSlingPostServletInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingServletsPostImplSlingPostServletInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingServletsPostImplSlingPostServletInfoBuilder</returns>
        public OrgApacheSlingServletsPostImplSlingPostServletInfoBuilder With()
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

        public bool Equals(OrgApacheSlingServletsPostImplSlingPostServletInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingServletsPostImplSlingPostServletInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingServletsPostImplSlingPostServletInfo</param>
        /// <param name="right">Compared (OrgApacheSlingServletsPostImplSlingPostServletInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingServletsPostImplSlingPostServletInfo left, OrgApacheSlingServletsPostImplSlingPostServletInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingServletsPostImplSlingPostServletInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingServletsPostImplSlingPostServletInfo</param>
        /// <param name="right">Compared (OrgApacheSlingServletsPostImplSlingPostServletInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingServletsPostImplSlingPostServletInfo left, OrgApacheSlingServletsPostImplSlingPostServletInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingServletsPostImplSlingPostServletInfo.
        /// </summary>
        public sealed class OrgApacheSlingServletsPostImplSlingPostServletInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingServletsPostImplSlingPostServletProperties _Properties;

            internal OrgApacheSlingServletsPostImplSlingPostServletInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingServletsPostImplSlingPostServletInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingServletsPostImplSlingPostServletInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingServletsPostImplSlingPostServletInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingServletsPostImplSlingPostServletInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingServletsPostImplSlingPostServletInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingServletsPostImplSlingPostServletInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingServletsPostImplSlingPostServletInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingServletsPostImplSlingPostServletInfoBuilder Properties(OrgApacheSlingServletsPostImplSlingPostServletProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingServletsPostImplSlingPostServletInfo.
            /// </summary>
            /// <returns>OrgApacheSlingServletsPostImplSlingPostServletInfo</returns>
            public OrgApacheSlingServletsPostImplSlingPostServletInfo Build()
            {
                Validate();
                return new OrgApacheSlingServletsPostImplSlingPostServletInfo(
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