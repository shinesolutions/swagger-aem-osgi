using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqNotificationImplNotificationServiceImplInfo
    /// </summary>
    public sealed class ComDayCqNotificationImplNotificationServiceImplInfo:  IEquatable<ComDayCqNotificationImplNotificationServiceImplInfo>
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
        public ComDayCqNotificationImplNotificationServiceImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqNotificationImplNotificationServiceImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqNotificationImplNotificationServiceImplInfo()
        {
        }

        private ComDayCqNotificationImplNotificationServiceImplInfo(string Pid, string Title, string Description, ComDayCqNotificationImplNotificationServiceImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqNotificationImplNotificationServiceImplInfo.
        /// </summary>
        /// <returns>ComDayCqNotificationImplNotificationServiceImplInfoBuilder</returns>
        public static ComDayCqNotificationImplNotificationServiceImplInfoBuilder Builder()
        {
            return new ComDayCqNotificationImplNotificationServiceImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqNotificationImplNotificationServiceImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqNotificationImplNotificationServiceImplInfoBuilder</returns>
        public ComDayCqNotificationImplNotificationServiceImplInfoBuilder With()
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

        public bool Equals(ComDayCqNotificationImplNotificationServiceImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqNotificationImplNotificationServiceImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqNotificationImplNotificationServiceImplInfo</param>
        /// <param name="right">Compared (ComDayCqNotificationImplNotificationServiceImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqNotificationImplNotificationServiceImplInfo left, ComDayCqNotificationImplNotificationServiceImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqNotificationImplNotificationServiceImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqNotificationImplNotificationServiceImplInfo</param>
        /// <param name="right">Compared (ComDayCqNotificationImplNotificationServiceImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqNotificationImplNotificationServiceImplInfo left, ComDayCqNotificationImplNotificationServiceImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqNotificationImplNotificationServiceImplInfo.
        /// </summary>
        public sealed class ComDayCqNotificationImplNotificationServiceImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqNotificationImplNotificationServiceImplProperties _Properties;

            internal ComDayCqNotificationImplNotificationServiceImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqNotificationImplNotificationServiceImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqNotificationImplNotificationServiceImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqNotificationImplNotificationServiceImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqNotificationImplNotificationServiceImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqNotificationImplNotificationServiceImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqNotificationImplNotificationServiceImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqNotificationImplNotificationServiceImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqNotificationImplNotificationServiceImplInfoBuilder Properties(ComDayCqNotificationImplNotificationServiceImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqNotificationImplNotificationServiceImplInfo.
            /// </summary>
            /// <returns>ComDayCqNotificationImplNotificationServiceImplInfo</returns>
            public ComDayCqNotificationImplNotificationServiceImplInfo Build()
            {
                Validate();
                return new ComDayCqNotificationImplNotificationServiceImplInfo(
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