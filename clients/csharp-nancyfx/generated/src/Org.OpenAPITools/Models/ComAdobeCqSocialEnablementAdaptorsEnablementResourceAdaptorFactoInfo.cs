using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfo
    /// </summary>
    public sealed class ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfo:  IEquatable<ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfo>
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
        public ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfo()
        {
        }

        private ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfo(string Pid, string Title, string Description, ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfoBuilder</returns>
        public static ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfoBuilder Builder()
        {
            return new ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfoBuilder</returns>
        public ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfo left, ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfo left, ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties _Properties;

            internal ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfoBuilder Properties(ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfo</returns>
            public ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfo(
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