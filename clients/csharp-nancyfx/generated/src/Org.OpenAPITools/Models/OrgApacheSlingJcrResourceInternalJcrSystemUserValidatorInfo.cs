using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfo
    /// </summary>
    public sealed class OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfo:  IEquatable<OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfo>
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
        public OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfo()
        {
        }

        private OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfo(string Pid, string Title, string Description, OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfo.
        /// </summary>
        /// <returns>OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfoBuilder</returns>
        public static OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfoBuilder Builder()
        {
            return new OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfoBuilder</returns>
        public OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfoBuilder With()
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

        public bool Equals(OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfo</param>
        /// <param name="right">Compared (OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfo left, OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfo</param>
        /// <param name="right">Compared (OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfo left, OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfo.
        /// </summary>
        public sealed class OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties _Properties;

            internal OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfoBuilder Properties(OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfo.
            /// </summary>
            /// <returns>OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfo</returns>
            public OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfo Build()
            {
                Validate();
                return new OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfo(
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