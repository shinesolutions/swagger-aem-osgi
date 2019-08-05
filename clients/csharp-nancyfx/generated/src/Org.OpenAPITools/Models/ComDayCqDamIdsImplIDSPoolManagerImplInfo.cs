using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamIdsImplIDSPoolManagerImplInfo
    /// </summary>
    public sealed class ComDayCqDamIdsImplIDSPoolManagerImplInfo:  IEquatable<ComDayCqDamIdsImplIDSPoolManagerImplInfo>
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
        public ComDayCqDamIdsImplIDSPoolManagerImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamIdsImplIDSPoolManagerImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamIdsImplIDSPoolManagerImplInfo()
        {
        }

        private ComDayCqDamIdsImplIDSPoolManagerImplInfo(string Pid, string Title, string Description, ComDayCqDamIdsImplIDSPoolManagerImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamIdsImplIDSPoolManagerImplInfo.
        /// </summary>
        /// <returns>ComDayCqDamIdsImplIDSPoolManagerImplInfoBuilder</returns>
        public static ComDayCqDamIdsImplIDSPoolManagerImplInfoBuilder Builder()
        {
            return new ComDayCqDamIdsImplIDSPoolManagerImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamIdsImplIDSPoolManagerImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamIdsImplIDSPoolManagerImplInfoBuilder</returns>
        public ComDayCqDamIdsImplIDSPoolManagerImplInfoBuilder With()
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

        public bool Equals(ComDayCqDamIdsImplIDSPoolManagerImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamIdsImplIDSPoolManagerImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamIdsImplIDSPoolManagerImplInfo</param>
        /// <param name="right">Compared (ComDayCqDamIdsImplIDSPoolManagerImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamIdsImplIDSPoolManagerImplInfo left, ComDayCqDamIdsImplIDSPoolManagerImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamIdsImplIDSPoolManagerImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamIdsImplIDSPoolManagerImplInfo</param>
        /// <param name="right">Compared (ComDayCqDamIdsImplIDSPoolManagerImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamIdsImplIDSPoolManagerImplInfo left, ComDayCqDamIdsImplIDSPoolManagerImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamIdsImplIDSPoolManagerImplInfo.
        /// </summary>
        public sealed class ComDayCqDamIdsImplIDSPoolManagerImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamIdsImplIDSPoolManagerImplProperties _Properties;

            internal ComDayCqDamIdsImplIDSPoolManagerImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamIdsImplIDSPoolManagerImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamIdsImplIDSPoolManagerImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamIdsImplIDSPoolManagerImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamIdsImplIDSPoolManagerImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamIdsImplIDSPoolManagerImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamIdsImplIDSPoolManagerImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamIdsImplIDSPoolManagerImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamIdsImplIDSPoolManagerImplInfoBuilder Properties(ComDayCqDamIdsImplIDSPoolManagerImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamIdsImplIDSPoolManagerImplInfo.
            /// </summary>
            /// <returns>ComDayCqDamIdsImplIDSPoolManagerImplInfo</returns>
            public ComDayCqDamIdsImplIDSPoolManagerImplInfo Build()
            {
                Validate();
                return new ComDayCqDamIdsImplIDSPoolManagerImplInfo(
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