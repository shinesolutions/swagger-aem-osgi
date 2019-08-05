using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqTaggingImplTagGarbageCollectorInfo
    /// </summary>
    public sealed class ComDayCqTaggingImplTagGarbageCollectorInfo:  IEquatable<ComDayCqTaggingImplTagGarbageCollectorInfo>
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
        public ComDayCqTaggingImplTagGarbageCollectorProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqTaggingImplTagGarbageCollectorInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqTaggingImplTagGarbageCollectorInfo()
        {
        }

        private ComDayCqTaggingImplTagGarbageCollectorInfo(string Pid, string Title, string Description, ComDayCqTaggingImplTagGarbageCollectorProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqTaggingImplTagGarbageCollectorInfo.
        /// </summary>
        /// <returns>ComDayCqTaggingImplTagGarbageCollectorInfoBuilder</returns>
        public static ComDayCqTaggingImplTagGarbageCollectorInfoBuilder Builder()
        {
            return new ComDayCqTaggingImplTagGarbageCollectorInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqTaggingImplTagGarbageCollectorInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqTaggingImplTagGarbageCollectorInfoBuilder</returns>
        public ComDayCqTaggingImplTagGarbageCollectorInfoBuilder With()
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

        public bool Equals(ComDayCqTaggingImplTagGarbageCollectorInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqTaggingImplTagGarbageCollectorInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqTaggingImplTagGarbageCollectorInfo</param>
        /// <param name="right">Compared (ComDayCqTaggingImplTagGarbageCollectorInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqTaggingImplTagGarbageCollectorInfo left, ComDayCqTaggingImplTagGarbageCollectorInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqTaggingImplTagGarbageCollectorInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqTaggingImplTagGarbageCollectorInfo</param>
        /// <param name="right">Compared (ComDayCqTaggingImplTagGarbageCollectorInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqTaggingImplTagGarbageCollectorInfo left, ComDayCqTaggingImplTagGarbageCollectorInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqTaggingImplTagGarbageCollectorInfo.
        /// </summary>
        public sealed class ComDayCqTaggingImplTagGarbageCollectorInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqTaggingImplTagGarbageCollectorProperties _Properties;

            internal ComDayCqTaggingImplTagGarbageCollectorInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqTaggingImplTagGarbageCollectorInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqTaggingImplTagGarbageCollectorInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqTaggingImplTagGarbageCollectorInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqTaggingImplTagGarbageCollectorInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqTaggingImplTagGarbageCollectorInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqTaggingImplTagGarbageCollectorInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqTaggingImplTagGarbageCollectorInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqTaggingImplTagGarbageCollectorInfoBuilder Properties(ComDayCqTaggingImplTagGarbageCollectorProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqTaggingImplTagGarbageCollectorInfo.
            /// </summary>
            /// <returns>ComDayCqTaggingImplTagGarbageCollectorInfo</returns>
            public ComDayCqTaggingImplTagGarbageCollectorInfo Build()
            {
                Validate();
                return new ComDayCqTaggingImplTagGarbageCollectorInfo(
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