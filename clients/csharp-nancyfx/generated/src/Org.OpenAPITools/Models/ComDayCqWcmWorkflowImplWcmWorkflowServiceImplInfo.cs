using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfo
    /// </summary>
    public sealed class ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfo:  IEquatable<ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfo>
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
        public ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfo()
        {
        }

        private ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfo(string Pid, string Title, string Description, ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfo.
        /// </summary>
        /// <returns>ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfoBuilder</returns>
        public static ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfoBuilder Builder()
        {
            return new ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfoBuilder</returns>
        public ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfoBuilder With()
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

        public bool Equals(ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfo</param>
        /// <param name="right">Compared (ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfo left, ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfo</param>
        /// <param name="right">Compared (ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfo left, ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfo.
        /// </summary>
        public sealed class ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties _Properties;

            internal ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfoBuilder Properties(ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfo.
            /// </summary>
            /// <returns>ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfo</returns>
            public ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfo Build()
            {
                Validate();
                return new ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfo(
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