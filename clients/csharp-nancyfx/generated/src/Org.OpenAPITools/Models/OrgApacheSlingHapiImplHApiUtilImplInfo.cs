using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingHapiImplHApiUtilImplInfo
    /// </summary>
    public sealed class OrgApacheSlingHapiImplHApiUtilImplInfo:  IEquatable<OrgApacheSlingHapiImplHApiUtilImplInfo>
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
        public OrgApacheSlingHapiImplHApiUtilImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingHapiImplHApiUtilImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingHapiImplHApiUtilImplInfo()
        {
        }

        private OrgApacheSlingHapiImplHApiUtilImplInfo(string Pid, string Title, string Description, OrgApacheSlingHapiImplHApiUtilImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingHapiImplHApiUtilImplInfo.
        /// </summary>
        /// <returns>OrgApacheSlingHapiImplHApiUtilImplInfoBuilder</returns>
        public static OrgApacheSlingHapiImplHApiUtilImplInfoBuilder Builder()
        {
            return new OrgApacheSlingHapiImplHApiUtilImplInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingHapiImplHApiUtilImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingHapiImplHApiUtilImplInfoBuilder</returns>
        public OrgApacheSlingHapiImplHApiUtilImplInfoBuilder With()
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

        public bool Equals(OrgApacheSlingHapiImplHApiUtilImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingHapiImplHApiUtilImplInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingHapiImplHApiUtilImplInfo</param>
        /// <param name="right">Compared (OrgApacheSlingHapiImplHApiUtilImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingHapiImplHApiUtilImplInfo left, OrgApacheSlingHapiImplHApiUtilImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingHapiImplHApiUtilImplInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingHapiImplHApiUtilImplInfo</param>
        /// <param name="right">Compared (OrgApacheSlingHapiImplHApiUtilImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingHapiImplHApiUtilImplInfo left, OrgApacheSlingHapiImplHApiUtilImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingHapiImplHApiUtilImplInfo.
        /// </summary>
        public sealed class OrgApacheSlingHapiImplHApiUtilImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingHapiImplHApiUtilImplProperties _Properties;

            internal OrgApacheSlingHapiImplHApiUtilImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingHapiImplHApiUtilImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingHapiImplHApiUtilImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingHapiImplHApiUtilImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingHapiImplHApiUtilImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingHapiImplHApiUtilImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingHapiImplHApiUtilImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingHapiImplHApiUtilImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingHapiImplHApiUtilImplInfoBuilder Properties(OrgApacheSlingHapiImplHApiUtilImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingHapiImplHApiUtilImplInfo.
            /// </summary>
            /// <returns>OrgApacheSlingHapiImplHApiUtilImplInfo</returns>
            public OrgApacheSlingHapiImplHApiUtilImplInfo Build()
            {
                Validate();
                return new OrgApacheSlingHapiImplHApiUtilImplInfo(
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