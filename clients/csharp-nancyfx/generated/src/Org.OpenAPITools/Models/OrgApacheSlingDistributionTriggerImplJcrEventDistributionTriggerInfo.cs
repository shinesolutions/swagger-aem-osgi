using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfo
    /// </summary>
    public sealed class OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfo:  IEquatable<OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfo>
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
        public OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfo()
        {
        }

        private OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfo(string Pid, string Title, string Description, OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfo.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfoBuilder</returns>
        public static OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfoBuilder Builder()
        {
            return new OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfoBuilder</returns>
        public OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfoBuilder With()
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

        public bool Equals(OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfo</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfo left, OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfo</param>
        /// <param name="right">Compared (OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfo left, OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfo.
        /// </summary>
        public sealed class OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties _Properties;

            internal OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfoBuilder Properties(OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfo.
            /// </summary>
            /// <returns>OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfo</returns>
            public OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfo Build()
            {
                Validate();
                return new OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfo(
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