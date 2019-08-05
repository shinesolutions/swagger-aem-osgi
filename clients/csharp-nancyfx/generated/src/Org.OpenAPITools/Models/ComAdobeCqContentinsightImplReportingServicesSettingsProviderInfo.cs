using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqContentinsightImplReportingServicesSettingsProviderInfo
    /// </summary>
    public sealed class ComAdobeCqContentinsightImplReportingServicesSettingsProviderInfo:  IEquatable<ComAdobeCqContentinsightImplReportingServicesSettingsProviderInfo>
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
        public ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqContentinsightImplReportingServicesSettingsProviderInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqContentinsightImplReportingServicesSettingsProviderInfo()
        {
        }

        private ComAdobeCqContentinsightImplReportingServicesSettingsProviderInfo(string Pid, string Title, string Description, ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqContentinsightImplReportingServicesSettingsProviderInfo.
        /// </summary>
        /// <returns>ComAdobeCqContentinsightImplReportingServicesSettingsProviderInfoBuilder</returns>
        public static ComAdobeCqContentinsightImplReportingServicesSettingsProviderInfoBuilder Builder()
        {
            return new ComAdobeCqContentinsightImplReportingServicesSettingsProviderInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqContentinsightImplReportingServicesSettingsProviderInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqContentinsightImplReportingServicesSettingsProviderInfoBuilder</returns>
        public ComAdobeCqContentinsightImplReportingServicesSettingsProviderInfoBuilder With()
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

        public bool Equals(ComAdobeCqContentinsightImplReportingServicesSettingsProviderInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqContentinsightImplReportingServicesSettingsProviderInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqContentinsightImplReportingServicesSettingsProviderInfo</param>
        /// <param name="right">Compared (ComAdobeCqContentinsightImplReportingServicesSettingsProviderInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqContentinsightImplReportingServicesSettingsProviderInfo left, ComAdobeCqContentinsightImplReportingServicesSettingsProviderInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqContentinsightImplReportingServicesSettingsProviderInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqContentinsightImplReportingServicesSettingsProviderInfo</param>
        /// <param name="right">Compared (ComAdobeCqContentinsightImplReportingServicesSettingsProviderInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqContentinsightImplReportingServicesSettingsProviderInfo left, ComAdobeCqContentinsightImplReportingServicesSettingsProviderInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqContentinsightImplReportingServicesSettingsProviderInfo.
        /// </summary>
        public sealed class ComAdobeCqContentinsightImplReportingServicesSettingsProviderInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties _Properties;

            internal ComAdobeCqContentinsightImplReportingServicesSettingsProviderInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqContentinsightImplReportingServicesSettingsProviderInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqContentinsightImplReportingServicesSettingsProviderInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqContentinsightImplReportingServicesSettingsProviderInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqContentinsightImplReportingServicesSettingsProviderInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqContentinsightImplReportingServicesSettingsProviderInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqContentinsightImplReportingServicesSettingsProviderInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqContentinsightImplReportingServicesSettingsProviderInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqContentinsightImplReportingServicesSettingsProviderInfoBuilder Properties(ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqContentinsightImplReportingServicesSettingsProviderInfo.
            /// </summary>
            /// <returns>ComAdobeCqContentinsightImplReportingServicesSettingsProviderInfo</returns>
            public ComAdobeCqContentinsightImplReportingServicesSettingsProviderInfo Build()
            {
                Validate();
                return new ComAdobeCqContentinsightImplReportingServicesSettingsProviderInfo(
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