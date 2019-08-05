using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqDeserfwImplDeserializationFirewallImplInfo
    /// </summary>
    public sealed class ComAdobeCqDeserfwImplDeserializationFirewallImplInfo:  IEquatable<ComAdobeCqDeserfwImplDeserializationFirewallImplInfo>
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
        public ComAdobeCqDeserfwImplDeserializationFirewallImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqDeserfwImplDeserializationFirewallImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqDeserfwImplDeserializationFirewallImplInfo()
        {
        }

        private ComAdobeCqDeserfwImplDeserializationFirewallImplInfo(string Pid, string Title, string Description, ComAdobeCqDeserfwImplDeserializationFirewallImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqDeserfwImplDeserializationFirewallImplInfo.
        /// </summary>
        /// <returns>ComAdobeCqDeserfwImplDeserializationFirewallImplInfoBuilder</returns>
        public static ComAdobeCqDeserfwImplDeserializationFirewallImplInfoBuilder Builder()
        {
            return new ComAdobeCqDeserfwImplDeserializationFirewallImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqDeserfwImplDeserializationFirewallImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqDeserfwImplDeserializationFirewallImplInfoBuilder</returns>
        public ComAdobeCqDeserfwImplDeserializationFirewallImplInfoBuilder With()
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

        public bool Equals(ComAdobeCqDeserfwImplDeserializationFirewallImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqDeserfwImplDeserializationFirewallImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqDeserfwImplDeserializationFirewallImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqDeserfwImplDeserializationFirewallImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqDeserfwImplDeserializationFirewallImplInfo left, ComAdobeCqDeserfwImplDeserializationFirewallImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqDeserfwImplDeserializationFirewallImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqDeserfwImplDeserializationFirewallImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqDeserfwImplDeserializationFirewallImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqDeserfwImplDeserializationFirewallImplInfo left, ComAdobeCqDeserfwImplDeserializationFirewallImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqDeserfwImplDeserializationFirewallImplInfo.
        /// </summary>
        public sealed class ComAdobeCqDeserfwImplDeserializationFirewallImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqDeserfwImplDeserializationFirewallImplProperties _Properties;

            internal ComAdobeCqDeserfwImplDeserializationFirewallImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqDeserfwImplDeserializationFirewallImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqDeserfwImplDeserializationFirewallImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDeserfwImplDeserializationFirewallImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqDeserfwImplDeserializationFirewallImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDeserfwImplDeserializationFirewallImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqDeserfwImplDeserializationFirewallImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDeserfwImplDeserializationFirewallImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqDeserfwImplDeserializationFirewallImplInfoBuilder Properties(ComAdobeCqDeserfwImplDeserializationFirewallImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqDeserfwImplDeserializationFirewallImplInfo.
            /// </summary>
            /// <returns>ComAdobeCqDeserfwImplDeserializationFirewallImplInfo</returns>
            public ComAdobeCqDeserfwImplDeserializationFirewallImplInfo Build()
            {
                Validate();
                return new ComAdobeCqDeserfwImplDeserializationFirewallImplInfo(
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