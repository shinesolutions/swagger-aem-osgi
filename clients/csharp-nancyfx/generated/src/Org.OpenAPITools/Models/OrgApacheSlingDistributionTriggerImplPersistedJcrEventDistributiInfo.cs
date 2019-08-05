using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo
    /// </summary>
    public sealed class OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo:  IEquatable<OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo>
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
        public OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo()
        {
        }

        private OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo(string Pid, string Title, string Description, OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfoBuilder</returns>
        public static OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfoBuilder Builder()
        {
            return new OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfoBuilder</returns>
        public OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfoBuilder With()
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

        public bool Equals(OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo left, OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo left, OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo.
        /// </summary>
        public sealed class OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties _Properties;

            internal OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfoBuilder Properties(OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo.
            /// </summary>
            /// <returns>OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo</returns>
            public OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo Build()
            {
                Validate();
                return new OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo(
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