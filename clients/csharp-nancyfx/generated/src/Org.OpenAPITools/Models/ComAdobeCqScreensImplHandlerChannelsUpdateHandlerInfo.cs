using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo
    /// </summary>
    public sealed class ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo:  IEquatable<ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo>
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
        public ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo()
        {
        }

        private ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo(string Pid, string Title, string Description, ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo.
        /// </summary>
        /// <returns>ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfoBuilder</returns>
        public static ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfoBuilder Builder()
        {
            return new ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfoBuilder</returns>
        public ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfoBuilder With()
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

        public bool Equals(ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo</param>
        /// <param name="right">Compared (ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo left, ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo</param>
        /// <param name="right">Compared (ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo left, ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo.
        /// </summary>
        public sealed class ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties _Properties;

            internal ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfoBuilder Properties(ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo.
            /// </summary>
            /// <returns>ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo</returns>
            public ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo Build()
            {
                Validate();
                return new ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo(
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