using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfo
    /// </summary>
    public sealed class ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfo:  IEquatable<ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfo>
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
        public ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfo()
        {
        }

        private ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfo(string Pid, string Title, string Description, ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfoBuilder</returns>
        public static ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfoBuilder Builder()
        {
            return new ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfoBuilder</returns>
        public ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfo left, ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfo left, ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfo.
        /// </summary>
        public sealed class ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties _Properties;

            internal ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfoBuilder Properties(ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfo</returns>
            public ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfo Build()
            {
                Validate();
                return new ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfo(
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