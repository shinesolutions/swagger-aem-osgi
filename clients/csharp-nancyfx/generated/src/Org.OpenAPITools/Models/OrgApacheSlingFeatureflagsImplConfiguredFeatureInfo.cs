using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo
    /// </summary>
    public sealed class OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo:  IEquatable<OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo>
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
        public OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo()
        {
        }

        private OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo(string Pid, string Title, string Description, OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo.
        /// </summary>
        /// <returns>OrgApacheSlingFeatureflagsImplConfiguredFeatureInfoBuilder</returns>
        public static OrgApacheSlingFeatureflagsImplConfiguredFeatureInfoBuilder Builder()
        {
            return new OrgApacheSlingFeatureflagsImplConfiguredFeatureInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingFeatureflagsImplConfiguredFeatureInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingFeatureflagsImplConfiguredFeatureInfoBuilder</returns>
        public OrgApacheSlingFeatureflagsImplConfiguredFeatureInfoBuilder With()
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

        public bool Equals(OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo</param>
        /// <param name="right">Compared (OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo left, OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo</param>
        /// <param name="right">Compared (OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo left, OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo.
        /// </summary>
        public sealed class OrgApacheSlingFeatureflagsImplConfiguredFeatureInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties _Properties;

            internal OrgApacheSlingFeatureflagsImplConfiguredFeatureInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingFeatureflagsImplConfiguredFeatureInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingFeatureflagsImplConfiguredFeatureInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingFeatureflagsImplConfiguredFeatureInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingFeatureflagsImplConfiguredFeatureInfoBuilder Properties(OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo.
            /// </summary>
            /// <returns>OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo</returns>
            public OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo Build()
            {
                Validate();
                return new OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo(
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