using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo
    /// </summary>
    public sealed class ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo:  IEquatable<ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo>
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
        public ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo()
        {
        }

        private ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo(string Pid, string Title, string Description, ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfoBuilder</returns>
        public static ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfoBuilder Builder()
        {
            return new ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfoBuilder</returns>
        public ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfoBuilder With()
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

        public bool Equals(ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo left, ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo left, ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo.
        /// </summary>
        public sealed class ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties _Properties;

            internal ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfoBuilder Properties(ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo</returns>
            public ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo Build()
            {
                Validate();
                return new ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo(
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