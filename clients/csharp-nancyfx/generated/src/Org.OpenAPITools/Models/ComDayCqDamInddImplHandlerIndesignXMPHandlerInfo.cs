using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamInddImplHandlerIndesignXMPHandlerInfo
    /// </summary>
    public sealed class ComDayCqDamInddImplHandlerIndesignXMPHandlerInfo:  IEquatable<ComDayCqDamInddImplHandlerIndesignXMPHandlerInfo>
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
        public ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamInddImplHandlerIndesignXMPHandlerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamInddImplHandlerIndesignXMPHandlerInfo()
        {
        }

        private ComDayCqDamInddImplHandlerIndesignXMPHandlerInfo(string Pid, string Title, string Description, ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamInddImplHandlerIndesignXMPHandlerInfo.
        /// </summary>
        /// <returns>ComDayCqDamInddImplHandlerIndesignXMPHandlerInfoBuilder</returns>
        public static ComDayCqDamInddImplHandlerIndesignXMPHandlerInfoBuilder Builder()
        {
            return new ComDayCqDamInddImplHandlerIndesignXMPHandlerInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamInddImplHandlerIndesignXMPHandlerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamInddImplHandlerIndesignXMPHandlerInfoBuilder</returns>
        public ComDayCqDamInddImplHandlerIndesignXMPHandlerInfoBuilder With()
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

        public bool Equals(ComDayCqDamInddImplHandlerIndesignXMPHandlerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamInddImplHandlerIndesignXMPHandlerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamInddImplHandlerIndesignXMPHandlerInfo</param>
        /// <param name="right">Compared (ComDayCqDamInddImplHandlerIndesignXMPHandlerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamInddImplHandlerIndesignXMPHandlerInfo left, ComDayCqDamInddImplHandlerIndesignXMPHandlerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamInddImplHandlerIndesignXMPHandlerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamInddImplHandlerIndesignXMPHandlerInfo</param>
        /// <param name="right">Compared (ComDayCqDamInddImplHandlerIndesignXMPHandlerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamInddImplHandlerIndesignXMPHandlerInfo left, ComDayCqDamInddImplHandlerIndesignXMPHandlerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamInddImplHandlerIndesignXMPHandlerInfo.
        /// </summary>
        public sealed class ComDayCqDamInddImplHandlerIndesignXMPHandlerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties _Properties;

            internal ComDayCqDamInddImplHandlerIndesignXMPHandlerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamInddImplHandlerIndesignXMPHandlerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamInddImplHandlerIndesignXMPHandlerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamInddImplHandlerIndesignXMPHandlerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamInddImplHandlerIndesignXMPHandlerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamInddImplHandlerIndesignXMPHandlerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamInddImplHandlerIndesignXMPHandlerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamInddImplHandlerIndesignXMPHandlerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamInddImplHandlerIndesignXMPHandlerInfoBuilder Properties(ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamInddImplHandlerIndesignXMPHandlerInfo.
            /// </summary>
            /// <returns>ComDayCqDamInddImplHandlerIndesignXMPHandlerInfo</returns>
            public ComDayCqDamInddImplHandlerIndesignXMPHandlerInfo Build()
            {
                Validate();
                return new ComDayCqDamInddImplHandlerIndesignXMPHandlerInfo(
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