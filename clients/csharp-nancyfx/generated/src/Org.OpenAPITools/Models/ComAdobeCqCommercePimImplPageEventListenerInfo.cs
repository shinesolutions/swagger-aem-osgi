using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqCommercePimImplPageEventListenerInfo
    /// </summary>
    public sealed class ComAdobeCqCommercePimImplPageEventListenerInfo:  IEquatable<ComAdobeCqCommercePimImplPageEventListenerInfo>
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
        public ComAdobeCqCommercePimImplPageEventListenerProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqCommercePimImplPageEventListenerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqCommercePimImplPageEventListenerInfo()
        {
        }

        private ComAdobeCqCommercePimImplPageEventListenerInfo(string Pid, string Title, string Description, ComAdobeCqCommercePimImplPageEventListenerProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqCommercePimImplPageEventListenerInfo.
        /// </summary>
        /// <returns>ComAdobeCqCommercePimImplPageEventListenerInfoBuilder</returns>
        public static ComAdobeCqCommercePimImplPageEventListenerInfoBuilder Builder()
        {
            return new ComAdobeCqCommercePimImplPageEventListenerInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqCommercePimImplPageEventListenerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqCommercePimImplPageEventListenerInfoBuilder</returns>
        public ComAdobeCqCommercePimImplPageEventListenerInfoBuilder With()
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

        public bool Equals(ComAdobeCqCommercePimImplPageEventListenerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqCommercePimImplPageEventListenerInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqCommercePimImplPageEventListenerInfo</param>
        /// <param name="right">Compared (ComAdobeCqCommercePimImplPageEventListenerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqCommercePimImplPageEventListenerInfo left, ComAdobeCqCommercePimImplPageEventListenerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqCommercePimImplPageEventListenerInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqCommercePimImplPageEventListenerInfo</param>
        /// <param name="right">Compared (ComAdobeCqCommercePimImplPageEventListenerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqCommercePimImplPageEventListenerInfo left, ComAdobeCqCommercePimImplPageEventListenerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqCommercePimImplPageEventListenerInfo.
        /// </summary>
        public sealed class ComAdobeCqCommercePimImplPageEventListenerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqCommercePimImplPageEventListenerProperties _Properties;

            internal ComAdobeCqCommercePimImplPageEventListenerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqCommercePimImplPageEventListenerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqCommercePimImplPageEventListenerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqCommercePimImplPageEventListenerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqCommercePimImplPageEventListenerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqCommercePimImplPageEventListenerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqCommercePimImplPageEventListenerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqCommercePimImplPageEventListenerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqCommercePimImplPageEventListenerInfoBuilder Properties(ComAdobeCqCommercePimImplPageEventListenerProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqCommercePimImplPageEventListenerInfo.
            /// </summary>
            /// <returns>ComAdobeCqCommercePimImplPageEventListenerInfo</returns>
            public ComAdobeCqCommercePimImplPageEventListenerInfo Build()
            {
                Validate();
                return new ComAdobeCqCommercePimImplPageEventListenerInfo(
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