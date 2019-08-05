using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo
    /// </summary>
    public sealed class ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo:  IEquatable<ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo>
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
        public ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo()
        {
        }

        private ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo(string Pid, string Title, string Description, ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo.
        /// </summary>
        /// <returns>ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfoBuilder</returns>
        public static ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfoBuilder Builder()
        {
            return new ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfoBuilder</returns>
        public ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfoBuilder With()
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

        public bool Equals(ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo</param>
        /// <param name="right">Compared (ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo left, ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo</param>
        /// <param name="right">Compared (ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo left, ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo.
        /// </summary>
        public sealed class ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties _Properties;

            internal ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfoBuilder Properties(ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo.
            /// </summary>
            /// <returns>ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo</returns>
            public ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo Build()
            {
                Validate();
                return new ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo(
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