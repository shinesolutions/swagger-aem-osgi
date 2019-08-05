using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo
    /// </summary>
    public sealed class ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo:  IEquatable<ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo>
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
        public ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo()
        {
        }

        private ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo(string Pid, string Title, string Description, ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfoBuilder</returns>
        public static ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfoBuilder Builder()
        {
            return new ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfoBuilder</returns>
        public ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo left, ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo left, ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo.
        /// </summary>
        public sealed class ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties _Properties;

            internal ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfoBuilder Properties(ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo</returns>
            public ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo Build()
            {
                Validate();
                return new ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo(
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