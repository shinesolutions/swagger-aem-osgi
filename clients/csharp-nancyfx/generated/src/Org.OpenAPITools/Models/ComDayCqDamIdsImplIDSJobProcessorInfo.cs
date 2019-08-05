using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamIdsImplIDSJobProcessorInfo
    /// </summary>
    public sealed class ComDayCqDamIdsImplIDSJobProcessorInfo:  IEquatable<ComDayCqDamIdsImplIDSJobProcessorInfo>
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
        public ComDayCqDamIdsImplIDSJobProcessorProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamIdsImplIDSJobProcessorInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamIdsImplIDSJobProcessorInfo()
        {
        }

        private ComDayCqDamIdsImplIDSJobProcessorInfo(string Pid, string Title, string Description, ComDayCqDamIdsImplIDSJobProcessorProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamIdsImplIDSJobProcessorInfo.
        /// </summary>
        /// <returns>ComDayCqDamIdsImplIDSJobProcessorInfoBuilder</returns>
        public static ComDayCqDamIdsImplIDSJobProcessorInfoBuilder Builder()
        {
            return new ComDayCqDamIdsImplIDSJobProcessorInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamIdsImplIDSJobProcessorInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamIdsImplIDSJobProcessorInfoBuilder</returns>
        public ComDayCqDamIdsImplIDSJobProcessorInfoBuilder With()
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

        public bool Equals(ComDayCqDamIdsImplIDSJobProcessorInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamIdsImplIDSJobProcessorInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamIdsImplIDSJobProcessorInfo</param>
        /// <param name="right">Compared (ComDayCqDamIdsImplIDSJobProcessorInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamIdsImplIDSJobProcessorInfo left, ComDayCqDamIdsImplIDSJobProcessorInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamIdsImplIDSJobProcessorInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamIdsImplIDSJobProcessorInfo</param>
        /// <param name="right">Compared (ComDayCqDamIdsImplIDSJobProcessorInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamIdsImplIDSJobProcessorInfo left, ComDayCqDamIdsImplIDSJobProcessorInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamIdsImplIDSJobProcessorInfo.
        /// </summary>
        public sealed class ComDayCqDamIdsImplIDSJobProcessorInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamIdsImplIDSJobProcessorProperties _Properties;

            internal ComDayCqDamIdsImplIDSJobProcessorInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamIdsImplIDSJobProcessorInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamIdsImplIDSJobProcessorInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamIdsImplIDSJobProcessorInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamIdsImplIDSJobProcessorInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamIdsImplIDSJobProcessorInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamIdsImplIDSJobProcessorInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamIdsImplIDSJobProcessorInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamIdsImplIDSJobProcessorInfoBuilder Properties(ComDayCqDamIdsImplIDSJobProcessorProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamIdsImplIDSJobProcessorInfo.
            /// </summary>
            /// <returns>ComDayCqDamIdsImplIDSJobProcessorInfo</returns>
            public ComDayCqDamIdsImplIDSJobProcessorInfo Build()
            {
                Validate();
                return new ComDayCqDamIdsImplIDSJobProcessorInfo(
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