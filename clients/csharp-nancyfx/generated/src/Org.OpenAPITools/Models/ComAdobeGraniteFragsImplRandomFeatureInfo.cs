using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteFragsImplRandomFeatureInfo
    /// </summary>
    public sealed class ComAdobeGraniteFragsImplRandomFeatureInfo:  IEquatable<ComAdobeGraniteFragsImplRandomFeatureInfo>
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
        public ComAdobeGraniteFragsImplRandomFeatureProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteFragsImplRandomFeatureInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteFragsImplRandomFeatureInfo()
        {
        }

        private ComAdobeGraniteFragsImplRandomFeatureInfo(string Pid, string Title, string Description, ComAdobeGraniteFragsImplRandomFeatureProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteFragsImplRandomFeatureInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteFragsImplRandomFeatureInfoBuilder</returns>
        public static ComAdobeGraniteFragsImplRandomFeatureInfoBuilder Builder()
        {
            return new ComAdobeGraniteFragsImplRandomFeatureInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteFragsImplRandomFeatureInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteFragsImplRandomFeatureInfoBuilder</returns>
        public ComAdobeGraniteFragsImplRandomFeatureInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteFragsImplRandomFeatureInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteFragsImplRandomFeatureInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteFragsImplRandomFeatureInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteFragsImplRandomFeatureInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteFragsImplRandomFeatureInfo left, ComAdobeGraniteFragsImplRandomFeatureInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteFragsImplRandomFeatureInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteFragsImplRandomFeatureInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteFragsImplRandomFeatureInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteFragsImplRandomFeatureInfo left, ComAdobeGraniteFragsImplRandomFeatureInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteFragsImplRandomFeatureInfo.
        /// </summary>
        public sealed class ComAdobeGraniteFragsImplRandomFeatureInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteFragsImplRandomFeatureProperties _Properties;

            internal ComAdobeGraniteFragsImplRandomFeatureInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteFragsImplRandomFeatureInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteFragsImplRandomFeatureInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteFragsImplRandomFeatureInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteFragsImplRandomFeatureInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteFragsImplRandomFeatureInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteFragsImplRandomFeatureInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteFragsImplRandomFeatureInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteFragsImplRandomFeatureInfoBuilder Properties(ComAdobeGraniteFragsImplRandomFeatureProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteFragsImplRandomFeatureInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteFragsImplRandomFeatureInfo</returns>
            public ComAdobeGraniteFragsImplRandomFeatureInfo Build()
            {
                Validate();
                return new ComAdobeGraniteFragsImplRandomFeatureInfo(
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