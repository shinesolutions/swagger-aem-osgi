using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteCorsImplCORSPolicyImplInfo
    /// </summary>
    public sealed class ComAdobeGraniteCorsImplCORSPolicyImplInfo:  IEquatable<ComAdobeGraniteCorsImplCORSPolicyImplInfo>
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
        public ComAdobeGraniteCorsImplCORSPolicyImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteCorsImplCORSPolicyImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteCorsImplCORSPolicyImplInfo()
        {
        }

        private ComAdobeGraniteCorsImplCORSPolicyImplInfo(string Pid, string Title, string Description, ComAdobeGraniteCorsImplCORSPolicyImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteCorsImplCORSPolicyImplInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteCorsImplCORSPolicyImplInfoBuilder</returns>
        public static ComAdobeGraniteCorsImplCORSPolicyImplInfoBuilder Builder()
        {
            return new ComAdobeGraniteCorsImplCORSPolicyImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteCorsImplCORSPolicyImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteCorsImplCORSPolicyImplInfoBuilder</returns>
        public ComAdobeGraniteCorsImplCORSPolicyImplInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteCorsImplCORSPolicyImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteCorsImplCORSPolicyImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteCorsImplCORSPolicyImplInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteCorsImplCORSPolicyImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteCorsImplCORSPolicyImplInfo left, ComAdobeGraniteCorsImplCORSPolicyImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteCorsImplCORSPolicyImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteCorsImplCORSPolicyImplInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteCorsImplCORSPolicyImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteCorsImplCORSPolicyImplInfo left, ComAdobeGraniteCorsImplCORSPolicyImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteCorsImplCORSPolicyImplInfo.
        /// </summary>
        public sealed class ComAdobeGraniteCorsImplCORSPolicyImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteCorsImplCORSPolicyImplProperties _Properties;

            internal ComAdobeGraniteCorsImplCORSPolicyImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteCorsImplCORSPolicyImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteCorsImplCORSPolicyImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteCorsImplCORSPolicyImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteCorsImplCORSPolicyImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteCorsImplCORSPolicyImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteCorsImplCORSPolicyImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteCorsImplCORSPolicyImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteCorsImplCORSPolicyImplInfoBuilder Properties(ComAdobeGraniteCorsImplCORSPolicyImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteCorsImplCORSPolicyImplInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteCorsImplCORSPolicyImplInfo</returns>
            public ComAdobeGraniteCorsImplCORSPolicyImplInfo Build()
            {
                Validate();
                return new ComAdobeGraniteCorsImplCORSPolicyImplInfo(
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