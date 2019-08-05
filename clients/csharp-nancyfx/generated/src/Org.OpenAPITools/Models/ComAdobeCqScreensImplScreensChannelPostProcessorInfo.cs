using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqScreensImplScreensChannelPostProcessorInfo
    /// </summary>
    public sealed class ComAdobeCqScreensImplScreensChannelPostProcessorInfo:  IEquatable<ComAdobeCqScreensImplScreensChannelPostProcessorInfo>
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
        public ComAdobeCqScreensImplScreensChannelPostProcessorProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqScreensImplScreensChannelPostProcessorInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqScreensImplScreensChannelPostProcessorInfo()
        {
        }

        private ComAdobeCqScreensImplScreensChannelPostProcessorInfo(string Pid, string Title, string Description, ComAdobeCqScreensImplScreensChannelPostProcessorProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqScreensImplScreensChannelPostProcessorInfo.
        /// </summary>
        /// <returns>ComAdobeCqScreensImplScreensChannelPostProcessorInfoBuilder</returns>
        public static ComAdobeCqScreensImplScreensChannelPostProcessorInfoBuilder Builder()
        {
            return new ComAdobeCqScreensImplScreensChannelPostProcessorInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqScreensImplScreensChannelPostProcessorInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqScreensImplScreensChannelPostProcessorInfoBuilder</returns>
        public ComAdobeCqScreensImplScreensChannelPostProcessorInfoBuilder With()
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

        public bool Equals(ComAdobeCqScreensImplScreensChannelPostProcessorInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqScreensImplScreensChannelPostProcessorInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqScreensImplScreensChannelPostProcessorInfo</param>
        /// <param name="right">Compared (ComAdobeCqScreensImplScreensChannelPostProcessorInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqScreensImplScreensChannelPostProcessorInfo left, ComAdobeCqScreensImplScreensChannelPostProcessorInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqScreensImplScreensChannelPostProcessorInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqScreensImplScreensChannelPostProcessorInfo</param>
        /// <param name="right">Compared (ComAdobeCqScreensImplScreensChannelPostProcessorInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqScreensImplScreensChannelPostProcessorInfo left, ComAdobeCqScreensImplScreensChannelPostProcessorInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqScreensImplScreensChannelPostProcessorInfo.
        /// </summary>
        public sealed class ComAdobeCqScreensImplScreensChannelPostProcessorInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqScreensImplScreensChannelPostProcessorProperties _Properties;

            internal ComAdobeCqScreensImplScreensChannelPostProcessorInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensImplScreensChannelPostProcessorInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqScreensImplScreensChannelPostProcessorInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensImplScreensChannelPostProcessorInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqScreensImplScreensChannelPostProcessorInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensImplScreensChannelPostProcessorInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqScreensImplScreensChannelPostProcessorInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensImplScreensChannelPostProcessorInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqScreensImplScreensChannelPostProcessorInfoBuilder Properties(ComAdobeCqScreensImplScreensChannelPostProcessorProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqScreensImplScreensChannelPostProcessorInfo.
            /// </summary>
            /// <returns>ComAdobeCqScreensImplScreensChannelPostProcessorInfo</returns>
            public ComAdobeCqScreensImplScreensChannelPostProcessorInfo Build()
            {
                Validate();
                return new ComAdobeCqScreensImplScreensChannelPostProcessorInfo(
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