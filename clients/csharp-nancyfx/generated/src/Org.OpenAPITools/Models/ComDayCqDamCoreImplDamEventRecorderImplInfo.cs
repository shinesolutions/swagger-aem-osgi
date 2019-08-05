using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplDamEventRecorderImplInfo
    /// </summary>
    public sealed class ComDayCqDamCoreImplDamEventRecorderImplInfo:  IEquatable<ComDayCqDamCoreImplDamEventRecorderImplInfo>
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
        public ComDayCqDamCoreImplDamEventRecorderImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplDamEventRecorderImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplDamEventRecorderImplInfo()
        {
        }

        private ComDayCqDamCoreImplDamEventRecorderImplInfo(string Pid, string Title, string Description, ComDayCqDamCoreImplDamEventRecorderImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplDamEventRecorderImplInfo.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplDamEventRecorderImplInfoBuilder</returns>
        public static ComDayCqDamCoreImplDamEventRecorderImplInfoBuilder Builder()
        {
            return new ComDayCqDamCoreImplDamEventRecorderImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplDamEventRecorderImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplDamEventRecorderImplInfoBuilder</returns>
        public ComDayCqDamCoreImplDamEventRecorderImplInfoBuilder With()
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

        public bool Equals(ComDayCqDamCoreImplDamEventRecorderImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplDamEventRecorderImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplDamEventRecorderImplInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplDamEventRecorderImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplDamEventRecorderImplInfo left, ComDayCqDamCoreImplDamEventRecorderImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplDamEventRecorderImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplDamEventRecorderImplInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplDamEventRecorderImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplDamEventRecorderImplInfo left, ComDayCqDamCoreImplDamEventRecorderImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplDamEventRecorderImplInfo.
        /// </summary>
        public sealed class ComDayCqDamCoreImplDamEventRecorderImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamCoreImplDamEventRecorderImplProperties _Properties;

            internal ComDayCqDamCoreImplDamEventRecorderImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplDamEventRecorderImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamCoreImplDamEventRecorderImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplDamEventRecorderImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamCoreImplDamEventRecorderImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplDamEventRecorderImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamCoreImplDamEventRecorderImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplDamEventRecorderImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamCoreImplDamEventRecorderImplInfoBuilder Properties(ComDayCqDamCoreImplDamEventRecorderImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplDamEventRecorderImplInfo.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplDamEventRecorderImplInfo</returns>
            public ComDayCqDamCoreImplDamEventRecorderImplInfo Build()
            {
                Validate();
                return new ComDayCqDamCoreImplDamEventRecorderImplInfo(
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