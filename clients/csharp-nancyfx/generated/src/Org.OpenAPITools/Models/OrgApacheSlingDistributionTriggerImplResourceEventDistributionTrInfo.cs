using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfo
    /// </summary>
    public sealed class OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfo:  IEquatable<OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfo>
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
        public OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfo()
        {
        }

        private OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfo(string Pid, string Title, string Description, OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfo.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfoBuilder</returns>
        public static OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfoBuilder Builder()
        {
            return new OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfoBuilder</returns>
        public OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfoBuilder With()
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

        public bool Equals(OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfo</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfo left, OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfo</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfo left, OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfo.
        /// </summary>
        public sealed class OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties _Properties;

            internal OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfoBuilder Properties(OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfo.
            /// </summary>
            /// <returns>OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfo</returns>
            public OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfo Build()
            {
                Validate();
                return new OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfo(
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