using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo
    /// </summary>
    public sealed class ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo:  IEquatable<ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo>
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
        public ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo()
        {
        }

        private ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo(string Pid, string Title, string Description, ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo.
        /// </summary>
        /// <returns>ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfoBuilder</returns>
        public static ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfoBuilder Builder()
        {
            return new ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfoBuilder</returns>
        public ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfoBuilder With()
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

        public bool Equals(ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo</param>
        /// <param name="right">Compared (ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo left, ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo</param>
        /// <param name="right">Compared (ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo left, ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo.
        /// </summary>
        public sealed class ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties _Properties;

            internal ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfoBuilder Properties(ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo.
            /// </summary>
            /// <returns>ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo</returns>
            public ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo Build()
            {
                Validate();
                return new ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo(
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