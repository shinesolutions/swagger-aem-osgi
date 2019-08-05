using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfo
    /// </summary>
    public sealed class OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfo:  IEquatable<OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfo>
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
        public OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfo()
        {
        }

        private OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfo(string Pid, string Title, string Description, OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfo.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfoBuilder</returns>
        public static OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfoBuilder Builder()
        {
            return new OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfoBuilder</returns>
        public OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfoBuilder With()
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

        public bool Equals(OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfo</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfo left, OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfo</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfo left, OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfo.
        /// </summary>
        public sealed class OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties _Properties;

            internal OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfoBuilder Properties(OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfo.
            /// </summary>
            /// <returns>OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfo</returns>
            public OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfo Build()
            {
                Validate();
                return new OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfo(
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