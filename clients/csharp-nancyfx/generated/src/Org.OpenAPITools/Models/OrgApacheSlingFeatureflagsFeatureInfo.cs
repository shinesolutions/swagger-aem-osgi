using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingFeatureflagsFeatureInfo
    /// </summary>
    public sealed class OrgApacheSlingFeatureflagsFeatureInfo:  IEquatable<OrgApacheSlingFeatureflagsFeatureInfo>
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
        public OrgApacheSlingFeatureflagsFeatureProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingFeatureflagsFeatureInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingFeatureflagsFeatureInfo()
        {
        }

        private OrgApacheSlingFeatureflagsFeatureInfo(string Pid, string Title, string Description, OrgApacheSlingFeatureflagsFeatureProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingFeatureflagsFeatureInfo.
        /// </summary>
        /// <returns>OrgApacheSlingFeatureflagsFeatureInfoBuilder</returns>
        public static OrgApacheSlingFeatureflagsFeatureInfoBuilder Builder()
        {
            return new OrgApacheSlingFeatureflagsFeatureInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingFeatureflagsFeatureInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingFeatureflagsFeatureInfoBuilder</returns>
        public OrgApacheSlingFeatureflagsFeatureInfoBuilder With()
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

        public bool Equals(OrgApacheSlingFeatureflagsFeatureInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingFeatureflagsFeatureInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingFeatureflagsFeatureInfo</param>
        /// <param name="right">Compared (OrgApacheSlingFeatureflagsFeatureInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingFeatureflagsFeatureInfo left, OrgApacheSlingFeatureflagsFeatureInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingFeatureflagsFeatureInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingFeatureflagsFeatureInfo</param>
        /// <param name="right">Compared (OrgApacheSlingFeatureflagsFeatureInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingFeatureflagsFeatureInfo left, OrgApacheSlingFeatureflagsFeatureInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingFeatureflagsFeatureInfo.
        /// </summary>
        public sealed class OrgApacheSlingFeatureflagsFeatureInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingFeatureflagsFeatureProperties _Properties;

            internal OrgApacheSlingFeatureflagsFeatureInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingFeatureflagsFeatureInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingFeatureflagsFeatureInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingFeatureflagsFeatureInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingFeatureflagsFeatureInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingFeatureflagsFeatureInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingFeatureflagsFeatureInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingFeatureflagsFeatureInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingFeatureflagsFeatureInfoBuilder Properties(OrgApacheSlingFeatureflagsFeatureProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingFeatureflagsFeatureInfo.
            /// </summary>
            /// <returns>OrgApacheSlingFeatureflagsFeatureInfo</returns>
            public OrgApacheSlingFeatureflagsFeatureInfo Build()
            {
                Validate();
                return new OrgApacheSlingFeatureflagsFeatureInfo(
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