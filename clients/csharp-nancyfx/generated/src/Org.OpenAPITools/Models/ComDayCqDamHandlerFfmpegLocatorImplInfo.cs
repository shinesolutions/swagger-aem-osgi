using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamHandlerFfmpegLocatorImplInfo
    /// </summary>
    public sealed class ComDayCqDamHandlerFfmpegLocatorImplInfo:  IEquatable<ComDayCqDamHandlerFfmpegLocatorImplInfo>
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
        public ComDayCqDamHandlerFfmpegLocatorImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamHandlerFfmpegLocatorImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamHandlerFfmpegLocatorImplInfo()
        {
        }

        private ComDayCqDamHandlerFfmpegLocatorImplInfo(string Pid, string Title, string Description, ComDayCqDamHandlerFfmpegLocatorImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamHandlerFfmpegLocatorImplInfo.
        /// </summary>
        /// <returns>ComDayCqDamHandlerFfmpegLocatorImplInfoBuilder</returns>
        public static ComDayCqDamHandlerFfmpegLocatorImplInfoBuilder Builder()
        {
            return new ComDayCqDamHandlerFfmpegLocatorImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamHandlerFfmpegLocatorImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamHandlerFfmpegLocatorImplInfoBuilder</returns>
        public ComDayCqDamHandlerFfmpegLocatorImplInfoBuilder With()
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

        public bool Equals(ComDayCqDamHandlerFfmpegLocatorImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamHandlerFfmpegLocatorImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamHandlerFfmpegLocatorImplInfo</param>
        /// <param name="right">Compared (ComDayCqDamHandlerFfmpegLocatorImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamHandlerFfmpegLocatorImplInfo left, ComDayCqDamHandlerFfmpegLocatorImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamHandlerFfmpegLocatorImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamHandlerFfmpegLocatorImplInfo</param>
        /// <param name="right">Compared (ComDayCqDamHandlerFfmpegLocatorImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamHandlerFfmpegLocatorImplInfo left, ComDayCqDamHandlerFfmpegLocatorImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamHandlerFfmpegLocatorImplInfo.
        /// </summary>
        public sealed class ComDayCqDamHandlerFfmpegLocatorImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamHandlerFfmpegLocatorImplProperties _Properties;

            internal ComDayCqDamHandlerFfmpegLocatorImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamHandlerFfmpegLocatorImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamHandlerFfmpegLocatorImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamHandlerFfmpegLocatorImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamHandlerFfmpegLocatorImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamHandlerFfmpegLocatorImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamHandlerFfmpegLocatorImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamHandlerFfmpegLocatorImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamHandlerFfmpegLocatorImplInfoBuilder Properties(ComDayCqDamHandlerFfmpegLocatorImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamHandlerFfmpegLocatorImplInfo.
            /// </summary>
            /// <returns>ComDayCqDamHandlerFfmpegLocatorImplInfo</returns>
            public ComDayCqDamHandlerFfmpegLocatorImplInfo Build()
            {
                Validate();
                return new ComDayCqDamHandlerFfmpegLocatorImplInfo(
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