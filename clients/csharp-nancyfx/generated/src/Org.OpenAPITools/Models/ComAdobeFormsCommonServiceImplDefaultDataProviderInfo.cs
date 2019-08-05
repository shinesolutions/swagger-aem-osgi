using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeFormsCommonServiceImplDefaultDataProviderInfo
    /// </summary>
    public sealed class ComAdobeFormsCommonServiceImplDefaultDataProviderInfo:  IEquatable<ComAdobeFormsCommonServiceImplDefaultDataProviderInfo>
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
        public ComAdobeFormsCommonServiceImplDefaultDataProviderProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeFormsCommonServiceImplDefaultDataProviderInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeFormsCommonServiceImplDefaultDataProviderInfo()
        {
        }

        private ComAdobeFormsCommonServiceImplDefaultDataProviderInfo(string Pid, string Title, string Description, ComAdobeFormsCommonServiceImplDefaultDataProviderProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeFormsCommonServiceImplDefaultDataProviderInfo.
        /// </summary>
        /// <returns>ComAdobeFormsCommonServiceImplDefaultDataProviderInfoBuilder</returns>
        public static ComAdobeFormsCommonServiceImplDefaultDataProviderInfoBuilder Builder()
        {
            return new ComAdobeFormsCommonServiceImplDefaultDataProviderInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeFormsCommonServiceImplDefaultDataProviderInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeFormsCommonServiceImplDefaultDataProviderInfoBuilder</returns>
        public ComAdobeFormsCommonServiceImplDefaultDataProviderInfoBuilder With()
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

        public bool Equals(ComAdobeFormsCommonServiceImplDefaultDataProviderInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeFormsCommonServiceImplDefaultDataProviderInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeFormsCommonServiceImplDefaultDataProviderInfo</param>
        /// <param name="right">Compared (ComAdobeFormsCommonServiceImplDefaultDataProviderInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeFormsCommonServiceImplDefaultDataProviderInfo left, ComAdobeFormsCommonServiceImplDefaultDataProviderInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeFormsCommonServiceImplDefaultDataProviderInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeFormsCommonServiceImplDefaultDataProviderInfo</param>
        /// <param name="right">Compared (ComAdobeFormsCommonServiceImplDefaultDataProviderInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeFormsCommonServiceImplDefaultDataProviderInfo left, ComAdobeFormsCommonServiceImplDefaultDataProviderInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeFormsCommonServiceImplDefaultDataProviderInfo.
        /// </summary>
        public sealed class ComAdobeFormsCommonServiceImplDefaultDataProviderInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeFormsCommonServiceImplDefaultDataProviderProperties _Properties;

            internal ComAdobeFormsCommonServiceImplDefaultDataProviderInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeFormsCommonServiceImplDefaultDataProviderInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeFormsCommonServiceImplDefaultDataProviderInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeFormsCommonServiceImplDefaultDataProviderInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeFormsCommonServiceImplDefaultDataProviderInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeFormsCommonServiceImplDefaultDataProviderInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeFormsCommonServiceImplDefaultDataProviderInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeFormsCommonServiceImplDefaultDataProviderInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeFormsCommonServiceImplDefaultDataProviderInfoBuilder Properties(ComAdobeFormsCommonServiceImplDefaultDataProviderProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeFormsCommonServiceImplDefaultDataProviderInfo.
            /// </summary>
            /// <returns>ComAdobeFormsCommonServiceImplDefaultDataProviderInfo</returns>
            public ComAdobeFormsCommonServiceImplDefaultDataProviderInfo Build()
            {
                Validate();
                return new ComAdobeFormsCommonServiceImplDefaultDataProviderInfo(
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