using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqTaggingImplJcrTagManagerFactoryImplInfo
    /// </summary>
    public sealed class ComDayCqTaggingImplJcrTagManagerFactoryImplInfo:  IEquatable<ComDayCqTaggingImplJcrTagManagerFactoryImplInfo>
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
        public ComDayCqTaggingImplJcrTagManagerFactoryImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqTaggingImplJcrTagManagerFactoryImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqTaggingImplJcrTagManagerFactoryImplInfo()
        {
        }

        private ComDayCqTaggingImplJcrTagManagerFactoryImplInfo(string Pid, string Title, string Description, ComDayCqTaggingImplJcrTagManagerFactoryImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqTaggingImplJcrTagManagerFactoryImplInfo.
        /// </summary>
        /// <returns>ComDayCqTaggingImplJcrTagManagerFactoryImplInfoBuilder</returns>
        public static ComDayCqTaggingImplJcrTagManagerFactoryImplInfoBuilder Builder()
        {
            return new ComDayCqTaggingImplJcrTagManagerFactoryImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqTaggingImplJcrTagManagerFactoryImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqTaggingImplJcrTagManagerFactoryImplInfoBuilder</returns>
        public ComDayCqTaggingImplJcrTagManagerFactoryImplInfoBuilder With()
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

        public bool Equals(ComDayCqTaggingImplJcrTagManagerFactoryImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqTaggingImplJcrTagManagerFactoryImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqTaggingImplJcrTagManagerFactoryImplInfo</param>
        /// <param name="right">Compared (ComDayCqTaggingImplJcrTagManagerFactoryImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqTaggingImplJcrTagManagerFactoryImplInfo left, ComDayCqTaggingImplJcrTagManagerFactoryImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqTaggingImplJcrTagManagerFactoryImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqTaggingImplJcrTagManagerFactoryImplInfo</param>
        /// <param name="right">Compared (ComDayCqTaggingImplJcrTagManagerFactoryImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqTaggingImplJcrTagManagerFactoryImplInfo left, ComDayCqTaggingImplJcrTagManagerFactoryImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqTaggingImplJcrTagManagerFactoryImplInfo.
        /// </summary>
        public sealed class ComDayCqTaggingImplJcrTagManagerFactoryImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqTaggingImplJcrTagManagerFactoryImplProperties _Properties;

            internal ComDayCqTaggingImplJcrTagManagerFactoryImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqTaggingImplJcrTagManagerFactoryImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqTaggingImplJcrTagManagerFactoryImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqTaggingImplJcrTagManagerFactoryImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqTaggingImplJcrTagManagerFactoryImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqTaggingImplJcrTagManagerFactoryImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqTaggingImplJcrTagManagerFactoryImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqTaggingImplJcrTagManagerFactoryImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqTaggingImplJcrTagManagerFactoryImplInfoBuilder Properties(ComDayCqTaggingImplJcrTagManagerFactoryImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqTaggingImplJcrTagManagerFactoryImplInfo.
            /// </summary>
            /// <returns>ComDayCqTaggingImplJcrTagManagerFactoryImplInfo</returns>
            public ComDayCqTaggingImplJcrTagManagerFactoryImplInfo Build()
            {
                Validate();
                return new ComDayCqTaggingImplJcrTagManagerFactoryImplInfo(
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