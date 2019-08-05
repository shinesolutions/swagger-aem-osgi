using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo
    /// </summary>
    public sealed class ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo:  IEquatable<ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo>
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
        public ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo()
        {
        }

        private ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo(string Pid, string Title, string Description, ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo.
        /// </summary>
        /// <returns>ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfoBuilder</returns>
        public static ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfoBuilder Builder()
        {
            return new ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfoBuilder</returns>
        public ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfoBuilder With()
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

        public bool Equals(ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo</param>
        /// <param name="right">Compared (ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo left, ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo</param>
        /// <param name="right">Compared (ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo left, ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo.
        /// </summary>
        public sealed class ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties _Properties;

            internal ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfoBuilder Properties(ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo.
            /// </summary>
            /// <returns>ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo</returns>
            public ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo Build()
            {
                Validate();
                return new ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo(
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