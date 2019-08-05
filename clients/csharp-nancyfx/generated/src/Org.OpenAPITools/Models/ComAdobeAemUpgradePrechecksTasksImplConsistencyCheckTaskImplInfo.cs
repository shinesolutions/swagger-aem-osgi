using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfo
    /// </summary>
    public sealed class ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfo:  IEquatable<ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfo>
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
        public ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfo()
        {
        }

        private ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfo(string Pid, string Title, string Description, ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfo.
        /// </summary>
        /// <returns>ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfoBuilder</returns>
        public static ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfoBuilder Builder()
        {
            return new ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfoBuilder</returns>
        public ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfoBuilder With()
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

        public bool Equals(ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfo</param>
        /// <param name="right">Compared (ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfo left, ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfo</param>
        /// <param name="right">Compared (ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfo left, ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfo.
        /// </summary>
        public sealed class ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties _Properties;

            internal ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfoBuilder Properties(ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfo.
            /// </summary>
            /// <returns>ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfo</returns>
            public ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfo Build()
            {
                Validate();
                return new ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfo(
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