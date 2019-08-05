using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfo
    /// </summary>
    public sealed class OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfo:  IEquatable<OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfo>
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
        public OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfo()
        {
        }

        private OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfo(string Pid, string Title, string Description, OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfo.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfoBuilder</returns>
        public static OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfoBuilder Builder()
        {
            return new OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfoBuilder</returns>
        public OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfoBuilder With()
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

        public bool Equals(OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfo</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfo left, OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfo</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfo left, OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfo.
        /// </summary>
        public sealed class OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties _Properties;

            internal OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfoBuilder Properties(OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfo.
            /// </summary>
            /// <returns>OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfo</returns>
            public OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfo Build()
            {
                Validate();
                return new OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfo(
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