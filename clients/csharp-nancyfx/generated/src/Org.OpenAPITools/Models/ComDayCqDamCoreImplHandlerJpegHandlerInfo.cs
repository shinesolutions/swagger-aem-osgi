using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplHandlerJpegHandlerInfo
    /// </summary>
    public sealed class ComDayCqDamCoreImplHandlerJpegHandlerInfo:  IEquatable<ComDayCqDamCoreImplHandlerJpegHandlerInfo>
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
        public ComDayCqDamCoreImplHandlerJpegHandlerProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplHandlerJpegHandlerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplHandlerJpegHandlerInfo()
        {
        }

        private ComDayCqDamCoreImplHandlerJpegHandlerInfo(string Pid, string Title, string Description, ComDayCqDamCoreImplHandlerJpegHandlerProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplHandlerJpegHandlerInfo.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplHandlerJpegHandlerInfoBuilder</returns>
        public static ComDayCqDamCoreImplHandlerJpegHandlerInfoBuilder Builder()
        {
            return new ComDayCqDamCoreImplHandlerJpegHandlerInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplHandlerJpegHandlerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplHandlerJpegHandlerInfoBuilder</returns>
        public ComDayCqDamCoreImplHandlerJpegHandlerInfoBuilder With()
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

        public bool Equals(ComDayCqDamCoreImplHandlerJpegHandlerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplHandlerJpegHandlerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplHandlerJpegHandlerInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplHandlerJpegHandlerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplHandlerJpegHandlerInfo left, ComDayCqDamCoreImplHandlerJpegHandlerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplHandlerJpegHandlerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplHandlerJpegHandlerInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplHandlerJpegHandlerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplHandlerJpegHandlerInfo left, ComDayCqDamCoreImplHandlerJpegHandlerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplHandlerJpegHandlerInfo.
        /// </summary>
        public sealed class ComDayCqDamCoreImplHandlerJpegHandlerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamCoreImplHandlerJpegHandlerProperties _Properties;

            internal ComDayCqDamCoreImplHandlerJpegHandlerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplHandlerJpegHandlerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamCoreImplHandlerJpegHandlerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplHandlerJpegHandlerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamCoreImplHandlerJpegHandlerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplHandlerJpegHandlerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamCoreImplHandlerJpegHandlerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplHandlerJpegHandlerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamCoreImplHandlerJpegHandlerInfoBuilder Properties(ComDayCqDamCoreImplHandlerJpegHandlerProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplHandlerJpegHandlerInfo.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplHandlerJpegHandlerInfo</returns>
            public ComDayCqDamCoreImplHandlerJpegHandlerInfo Build()
            {
                Validate();
                return new ComDayCqDamCoreImplHandlerJpegHandlerInfo(
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