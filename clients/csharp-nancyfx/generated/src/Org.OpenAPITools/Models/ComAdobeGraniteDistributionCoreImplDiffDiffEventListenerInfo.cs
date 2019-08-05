using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfo
    /// </summary>
    public sealed class ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfo:  IEquatable<ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfo>
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
        public ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfo()
        {
        }

        private ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfo(string Pid, string Title, string Description, ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfoBuilder</returns>
        public static ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfoBuilder Builder()
        {
            return new ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfoBuilder</returns>
        public ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfo left, ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfo left, ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfo.
        /// </summary>
        public sealed class ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties _Properties;

            internal ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfoBuilder Properties(ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfo</returns>
            public ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfo Build()
            {
                Validate();
                return new ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfo(
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