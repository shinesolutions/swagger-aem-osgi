using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfo
    /// </summary>
    public sealed class ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfo:  IEquatable<ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfo>
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
        public ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfo()
        {
        }

        private ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfo(string Pid, string Title, string Description, ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfoBuilder</returns>
        public static ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfoBuilder Builder()
        {
            return new ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfoBuilder</returns>
        public ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfo left, ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfo left, ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfo.
        /// </summary>
        public sealed class ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties _Properties;

            internal ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfoBuilder Properties(ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfo</returns>
            public ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfo Build()
            {
                Validate();
                return new ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfo(
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