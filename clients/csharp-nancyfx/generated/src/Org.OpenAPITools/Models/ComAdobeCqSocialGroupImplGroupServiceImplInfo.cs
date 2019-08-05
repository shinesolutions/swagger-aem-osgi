using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialGroupImplGroupServiceImplInfo
    /// </summary>
    public sealed class ComAdobeCqSocialGroupImplGroupServiceImplInfo:  IEquatable<ComAdobeCqSocialGroupImplGroupServiceImplInfo>
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
        public ComAdobeCqSocialGroupImplGroupServiceImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialGroupImplGroupServiceImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialGroupImplGroupServiceImplInfo()
        {
        }

        private ComAdobeCqSocialGroupImplGroupServiceImplInfo(string Pid, string Title, string Description, ComAdobeCqSocialGroupImplGroupServiceImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialGroupImplGroupServiceImplInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialGroupImplGroupServiceImplInfoBuilder</returns>
        public static ComAdobeCqSocialGroupImplGroupServiceImplInfoBuilder Builder()
        {
            return new ComAdobeCqSocialGroupImplGroupServiceImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialGroupImplGroupServiceImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialGroupImplGroupServiceImplInfoBuilder</returns>
        public ComAdobeCqSocialGroupImplGroupServiceImplInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialGroupImplGroupServiceImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialGroupImplGroupServiceImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialGroupImplGroupServiceImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialGroupImplGroupServiceImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialGroupImplGroupServiceImplInfo left, ComAdobeCqSocialGroupImplGroupServiceImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialGroupImplGroupServiceImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialGroupImplGroupServiceImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialGroupImplGroupServiceImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialGroupImplGroupServiceImplInfo left, ComAdobeCqSocialGroupImplGroupServiceImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialGroupImplGroupServiceImplInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialGroupImplGroupServiceImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialGroupImplGroupServiceImplProperties _Properties;

            internal ComAdobeCqSocialGroupImplGroupServiceImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialGroupImplGroupServiceImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialGroupImplGroupServiceImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialGroupImplGroupServiceImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialGroupImplGroupServiceImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialGroupImplGroupServiceImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialGroupImplGroupServiceImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialGroupImplGroupServiceImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialGroupImplGroupServiceImplInfoBuilder Properties(ComAdobeCqSocialGroupImplGroupServiceImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialGroupImplGroupServiceImplInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialGroupImplGroupServiceImplInfo</returns>
            public ComAdobeCqSocialGroupImplGroupServiceImplInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialGroupImplGroupServiceImplInfo(
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