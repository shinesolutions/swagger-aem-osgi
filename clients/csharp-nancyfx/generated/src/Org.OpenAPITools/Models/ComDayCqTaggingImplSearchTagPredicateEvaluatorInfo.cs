using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqTaggingImplSearchTagPredicateEvaluatorInfo
    /// </summary>
    public sealed class ComDayCqTaggingImplSearchTagPredicateEvaluatorInfo:  IEquatable<ComDayCqTaggingImplSearchTagPredicateEvaluatorInfo>
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
        public ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqTaggingImplSearchTagPredicateEvaluatorInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqTaggingImplSearchTagPredicateEvaluatorInfo()
        {
        }

        private ComDayCqTaggingImplSearchTagPredicateEvaluatorInfo(string Pid, string Title, string Description, ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqTaggingImplSearchTagPredicateEvaluatorInfo.
        /// </summary>
        /// <returns>ComDayCqTaggingImplSearchTagPredicateEvaluatorInfoBuilder</returns>
        public static ComDayCqTaggingImplSearchTagPredicateEvaluatorInfoBuilder Builder()
        {
            return new ComDayCqTaggingImplSearchTagPredicateEvaluatorInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqTaggingImplSearchTagPredicateEvaluatorInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqTaggingImplSearchTagPredicateEvaluatorInfoBuilder</returns>
        public ComDayCqTaggingImplSearchTagPredicateEvaluatorInfoBuilder With()
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

        public bool Equals(ComDayCqTaggingImplSearchTagPredicateEvaluatorInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqTaggingImplSearchTagPredicateEvaluatorInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqTaggingImplSearchTagPredicateEvaluatorInfo</param>
        /// <param name="right">Compared (ComDayCqTaggingImplSearchTagPredicateEvaluatorInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqTaggingImplSearchTagPredicateEvaluatorInfo left, ComDayCqTaggingImplSearchTagPredicateEvaluatorInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqTaggingImplSearchTagPredicateEvaluatorInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqTaggingImplSearchTagPredicateEvaluatorInfo</param>
        /// <param name="right">Compared (ComDayCqTaggingImplSearchTagPredicateEvaluatorInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqTaggingImplSearchTagPredicateEvaluatorInfo left, ComDayCqTaggingImplSearchTagPredicateEvaluatorInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqTaggingImplSearchTagPredicateEvaluatorInfo.
        /// </summary>
        public sealed class ComDayCqTaggingImplSearchTagPredicateEvaluatorInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties _Properties;

            internal ComDayCqTaggingImplSearchTagPredicateEvaluatorInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqTaggingImplSearchTagPredicateEvaluatorInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqTaggingImplSearchTagPredicateEvaluatorInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqTaggingImplSearchTagPredicateEvaluatorInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqTaggingImplSearchTagPredicateEvaluatorInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqTaggingImplSearchTagPredicateEvaluatorInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqTaggingImplSearchTagPredicateEvaluatorInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqTaggingImplSearchTagPredicateEvaluatorInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqTaggingImplSearchTagPredicateEvaluatorInfoBuilder Properties(ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqTaggingImplSearchTagPredicateEvaluatorInfo.
            /// </summary>
            /// <returns>ComDayCqTaggingImplSearchTagPredicateEvaluatorInfo</returns>
            public ComDayCqTaggingImplSearchTagPredicateEvaluatorInfo Build()
            {
                Validate();
                return new ComDayCqTaggingImplSearchTagPredicateEvaluatorInfo(
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