using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingJcrDavexImplServletsSlingDavExServletInfo
    /// </summary>
    public sealed class OrgApacheSlingJcrDavexImplServletsSlingDavExServletInfo:  IEquatable<OrgApacheSlingJcrDavexImplServletsSlingDavExServletInfo>
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
        public OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingJcrDavexImplServletsSlingDavExServletInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingJcrDavexImplServletsSlingDavExServletInfo()
        {
        }

        private OrgApacheSlingJcrDavexImplServletsSlingDavExServletInfo(string Pid, string Title, string Description, OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingJcrDavexImplServletsSlingDavExServletInfo.
        /// </summary>
        /// <returns>OrgApacheSlingJcrDavexImplServletsSlingDavExServletInfoBuilder</returns>
        public static OrgApacheSlingJcrDavexImplServletsSlingDavExServletInfoBuilder Builder()
        {
            return new OrgApacheSlingJcrDavexImplServletsSlingDavExServletInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingJcrDavexImplServletsSlingDavExServletInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingJcrDavexImplServletsSlingDavExServletInfoBuilder</returns>
        public OrgApacheSlingJcrDavexImplServletsSlingDavExServletInfoBuilder With()
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

        public bool Equals(OrgApacheSlingJcrDavexImplServletsSlingDavExServletInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingJcrDavexImplServletsSlingDavExServletInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingJcrDavexImplServletsSlingDavExServletInfo</param>
        /// <param name="right">Compared (OrgApacheSlingJcrDavexImplServletsSlingDavExServletInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingJcrDavexImplServletsSlingDavExServletInfo left, OrgApacheSlingJcrDavexImplServletsSlingDavExServletInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingJcrDavexImplServletsSlingDavExServletInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingJcrDavexImplServletsSlingDavExServletInfo</param>
        /// <param name="right">Compared (OrgApacheSlingJcrDavexImplServletsSlingDavExServletInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingJcrDavexImplServletsSlingDavExServletInfo left, OrgApacheSlingJcrDavexImplServletsSlingDavExServletInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingJcrDavexImplServletsSlingDavExServletInfo.
        /// </summary>
        public sealed class OrgApacheSlingJcrDavexImplServletsSlingDavExServletInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties _Properties;

            internal OrgApacheSlingJcrDavexImplServletsSlingDavExServletInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrDavexImplServletsSlingDavExServletInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingJcrDavexImplServletsSlingDavExServletInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrDavexImplServletsSlingDavExServletInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingJcrDavexImplServletsSlingDavExServletInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrDavexImplServletsSlingDavExServletInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingJcrDavexImplServletsSlingDavExServletInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrDavexImplServletsSlingDavExServletInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingJcrDavexImplServletsSlingDavExServletInfoBuilder Properties(OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingJcrDavexImplServletsSlingDavExServletInfo.
            /// </summary>
            /// <returns>OrgApacheSlingJcrDavexImplServletsSlingDavExServletInfo</returns>
            public OrgApacheSlingJcrDavexImplServletsSlingDavExServletInfo Build()
            {
                Validate();
                return new OrgApacheSlingJcrDavexImplServletsSlingDavExServletInfo(
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